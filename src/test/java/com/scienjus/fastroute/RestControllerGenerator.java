package com.scienjus.fastroute;

import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
public class RestControllerGenerator {

    public static final String TEMPLATE;

    static {
        StringBuilder buffer = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(ResourceUtils.getFile("classpath:controller.template"))))) {
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        TEMPLATE = buffer.toString();
    }

    public static void main(String[] args) {
        String classNames = "Tag Post User Group Articles Game Web Font Image Active Place";
//                " Movie Route Book Zoo Dream Fuck Place Like Follow Go Ruby Java Python Node Vue";
        for (String className : classNames.split(" ")) {
            for (String lastClassName: classNames.split(" ")) {
                generate("com.scienjus.fastroute.controllers", className + lastClassName, "/path/to/src/test/controllers/");
            }
        }
    }

    public static void generate(String packageName, String className, String path) {
        String firstChar = className.substring(0, 1);
        String others = className.substring(1);
        String upper = firstChar.toUpperCase() + others;
        String lower = firstChar.toLowerCase() + others;
        String fileName = path + packageName.replace(".", "/") + "/" + upper + "Controller.java";
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
            writer.write(TEMPLATE.replace("{package}", packageName).replace("{upper}", upper).replace("{lower}", lower));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
