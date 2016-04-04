package com.scienjus.fastroute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
public class FastRouteHandlerMapping extends RequestMappingHandlerMapping {

    private static final Logger LOGGER = LoggerFactory.getLogger(FastRouteHandlerMapping.class);

    private static final Pattern PATH_VARIABLE_PATTERN =  Pattern.compile("\\{[^/]+?\\}");

    private static final String PATH_VARIABLE_REPLACE =  "[^/]+";

    private Map<RequestMethod, Map<Integer, RequestMappingInfo>> regexRoutes = new HashMap<>();

    private Map<RequestMethod, Map<String, RequestMappingInfo>> staticRoutes = new HashMap<>();

    private Map<RequestMethod, Pattern> regexRoutePatterns = new HashMap<>();

    private volatile boolean init = false;

    @Override
    protected HandlerMethod lookupHandlerMethod(String lookupPath, HttpServletRequest request) throws Exception {
        //register
        register();
        //mapping
        RequestMappingInfo mapping = null;
        RequestMethod requestMethod = RequestMethod.valueOf(request.getMethod());
        //static routes
        Map<String, RequestMappingInfo> routeMap = staticRoutes.get(RequestMethod.valueOf(request.getMethod()));
        if (routeMap != null) {
            mapping = routeMap.get(lookupPath);
        }
        //regex routes
        if (mapping == null) {
            Matcher matcher = regexRoutePatterns.get(requestMethod).matcher(lookupPath);

            if (matcher.matches()) {
                int i = 1;
                while (matcher.group(i) == null) {
                    i++;
                }
                mapping = regexRoutes.get(requestMethod).get(i);
            }

        }
        if (mapping != null) {
            HandlerMethod method = getHandlerMethods().get(mapping);
            handleMatch(mapping, lookupPath, request);
            return method;
        }
        //405 or 404
        return null;
    }

    // a bad way
    private void register() {
        // only first request
        if (!init) {
            synchronized (this) {
                if (!init) {
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
                                if (matcher.find()) {
                                    if (regexRoutes.get(requestMethod) == null) {
                                        regexRoutes.put(requestMethod, new HashMap<Integer, RequestMappingInfo>());
                                        indexes.put(requestMethod, 1);
                                    }
                                    int i = indexes.get(requestMethod);
                                    regexRoutes.get(requestMethod).put(i, mapping);
                                    indexes.put(requestMethod, i + 1);
                                    if (patternBuilders.get(requestMethod) == null) {
                                        patternBuilders.put(requestMethod, new StringBuilder("^"));
                                    }
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
                        LOGGER.debug("init Fast Route, method:{}, regex:{}", method, patternBuilder.toString());
                        regexRoutePatterns.put(method, Pattern.compile(patternBuilder.toString()));
                    }
                    init = true;
                }
            }
        }
    }
}
