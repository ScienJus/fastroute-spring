package com.scienjus.fastroute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
public class FastRouteHandlerMapping extends RequestMappingHandlerMapping {

    private static final Pattern PATH_VARIABLE_PATTERN =  Pattern.compile("\\{[^/]+?\\}");

    private static final String PATH_VARIABLE_REPLACE =  "([^/]+)";

    private Map<RequestMethod, Map<Integer, FastRouteRequestMappingInfo>> regexRoutes = new HashMap<>();

    private Map<RequestMethod, Map<String, RequestMappingInfo>> staticRoutes = new HashMap<>();

    private Map<RequestMethod, Pattern> regexRoutePatterns = new HashMap<>();

    private volatile boolean init = false;

    private class FastRouteRequestMappingInfo {

        private RequestMappingInfo mapping;

        private List<String> variableNames;

        public FastRouteRequestMappingInfo(RequestMappingInfo mapping, List<String> variableNames) {
            this.mapping = mapping;
            this.variableNames = variableNames;
        }

        public RequestMappingInfo getMapping() {
            return mapping;
        }

        public List<String> getVariableNames() {
            return variableNames;
        }
    }

    @Override
    protected HandlerMethod lookupHandlerMethod(String lookupPath, HttpServletRequest request) throws Exception {
        // register
        register();
        // mapping
        RequestMappingInfo mapping = null;
        Map<String, String> uriVariables = new LinkedHashMap<>();

        RequestMethod requestMethod = RequestMethod.valueOf(request.getMethod());
        // static routes
        Map<String, RequestMappingInfo> routeMap = staticRoutes.get(requestMethod);
        if (routeMap != null) {
            mapping = routeMap.get(lookupPath);
        }
        // regex routes
        if (mapping == null) {
            Matcher matcher = regexRoutePatterns.get(requestMethod).matcher(lookupPath);

            if (matcher.matches()) {
                int i;
                for (i = 1; matcher.group(i) == null; i++);
                FastRouteRequestMappingInfo mappingInfo = regexRoutes.get(requestMethod).get(i);
                mapping = mappingInfo.getMapping();

                // find path variable
                String uriVariable;
                int j = 0;
                while (++i <= matcher.groupCount() && (uriVariable = matcher.group(i)) != null) {
                    uriVariables.put(mappingInfo.getVariableNames().get(j++), uriVariable);
                }
                if (logger.isTraceEnabled()) {
                    logger.trace("lookup path: " + lookupPath + " uri variables: " + uriVariables);
                }
            }

        }
        if (mapping != null) {
            HandlerMethod method = getHandlerMethods().get(mapping);
            //path variable
            //from AbstractHandlerMethodMapping
            request.setAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE, lookupPath);

            //from RequestMappingInfoHandlerMapping
            String bestPattern;
            Map<String, String> decodedUriVariables;

            Set<String> patterns = mapping.getPatternsCondition().getPatterns();
            if (patterns.isEmpty()) {
                bestPattern = lookupPath;
                decodedUriVariables = Collections.emptyMap();
            }
            else {
                bestPattern = patterns.iterator().next();
                decodedUriVariables = getUrlPathHelper().decodePathVariables(request, uriVariables);
            }

            request.setAttribute(BEST_MATCHING_PATTERN_ATTRIBUTE, bestPattern);
            request.setAttribute(URI_TEMPLATE_VARIABLES_ATTRIBUTE, decodedUriVariables);


            if (!mapping.getProducesCondition().getProducibleMediaTypes().isEmpty()) {
                Set<MediaType> mediaTypes = mapping.getProducesCondition().getProducibleMediaTypes();
                request.setAttribute(PRODUCIBLE_MEDIA_TYPES_ATTRIBUTE, mediaTypes);
            }
            return method;
        }
        // 405 or 404
        // TODO 405
        return null;
    }

    // a bad way
    private void register() {
        // only first request
        if (!init) {
            synchronized (this) {
                if (!init) {
                    long start = System.currentTimeMillis();

                    Map<RequestMethod, Integer> indexes = new HashMap<>();
                    Map<RequestMethod, StringBuilder> patternBuilders = new HashMap<>();
                    for (RequestMappingInfo mapping : getHandlerMethods().keySet()) {
                        // http method -> look path -> mapping
                        Set<RequestMethod> methods = mapping.getMethodsCondition().getMethods();
                        if (methods.isEmpty()) {
                            methods = new HashSet<>(Arrays.asList(RequestMethod.values()));
                        }
                        for (RequestMethod requestMethod : methods) {
                            for (String path : mapping.getPatternsCondition().getPatterns()) {
                                Matcher matcher = PATH_VARIABLE_PATTERN.matcher(path);
                                boolean find = false;
                                List<String> uriVariableNames = new ArrayList<>();
                                while (matcher.find()) {
                                    if (!find) {
                                        find = true;
                                    }
                                    String group = matcher.group(0);
                                    uriVariableNames.add(group.substring(1, group.length() - 1));   // {id} -> id
                                }
                                if (find) {
                                    if (regexRoutes.get(requestMethod) == null) {
                                        regexRoutes.put(requestMethod, new HashMap<Integer, FastRouteRequestMappingInfo>());
                                        patternBuilders.put(requestMethod, new StringBuilder("^"));
                                        indexes.put(requestMethod, 1);
                                    }
                                    int i = indexes.get(requestMethod);
                                    regexRoutes.get(requestMethod).put(i, new FastRouteRequestMappingInfo(mapping, uriVariableNames));
                                    indexes.put(requestMethod, i + uriVariableNames.size() + 1);
                                    patternBuilders.get(requestMethod).append("(").append(matcher.replaceAll(PATH_VARIABLE_REPLACE)).append(")|");
                                } else {
                                    if (staticRoutes.get(requestMethod) == null) {
                                        staticRoutes.put(requestMethod, new HashMap<String, RequestMappingInfo>());
                                    }
                                    staticRoutes.get(requestMethod).put(path, mapping);
                                }
                            }
                        }
                    }
                    for (Map.Entry<RequestMethod, StringBuilder> entry : patternBuilders.entrySet()) {
                        RequestMethod method = entry.getKey();
                        StringBuilder patternBuilder = entry.getValue();
                        if (patternBuilder.length() > 1) {
                            patternBuilder.setCharAt(patternBuilder.length() - 1, '$');
                        }
                        if (logger.isDebugEnabled()) {
                            logger.debug("init Fast Route, method: " + method + ", regex: " + patternBuilder);
                        }
                        regexRoutePatterns.put(method, Pattern.compile(patternBuilder.toString()));
                    }
                    init = true;

                    long initTime = System.currentTimeMillis() - start;

                    if (logger.isInfoEnabled()) {
                        logger.info("Fast Route init in " + initTime + " ms");
                    }
                }
            }
        }
    }
}
