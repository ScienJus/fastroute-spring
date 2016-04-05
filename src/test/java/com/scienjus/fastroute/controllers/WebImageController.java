package com.scienjus.fastroute.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
@RestController
public class WebImageController {

    @RequestMapping(value = "/webImage", method = GET)
    public String list() {
        return "webImage list";
    }

    @RequestMapping(value = "/webImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webImage detail " + id;
    }

    @RequestMapping(value = "/webImage", method = POST)
    public String create() {
        return "create webImage";
    }

    @RequestMapping(value = "/webImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webImage " + id;
    }

    @RequestMapping(value = "/webImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webImage " + id;
    }
}
