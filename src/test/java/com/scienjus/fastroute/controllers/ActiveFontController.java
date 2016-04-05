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
public class ActiveFontController {

    @RequestMapping(value = "/activeFont", method = GET)
    public String list() {
        return "activeFont list";
    }

    @RequestMapping(value = "/activeFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activeFont detail " + id;
    }

    @RequestMapping(value = "/activeFont", method = POST)
    public String create() {
        return "create activeFont";
    }

    @RequestMapping(value = "/activeFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activeFont " + id;
    }

    @RequestMapping(value = "/activeFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activeFont " + id;
    }
}
