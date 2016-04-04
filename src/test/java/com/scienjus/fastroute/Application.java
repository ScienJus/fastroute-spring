package com.scienjus.fastroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * @author ScienJus
 * @date 16/4/3.
 */
@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private RequestMappingHandlerMapping mapping;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
