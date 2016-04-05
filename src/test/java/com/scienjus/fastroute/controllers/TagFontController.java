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
public class TagFontController {

    @RequestMapping(value = "/tagFont", method = GET)
    public String list() {
        return "tagFont list";
    }

    @RequestMapping(value = "/tagFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagFont detail " + id;
    }

    @RequestMapping(value = "/tagFont", method = POST)
    public String create() {
        return "create tagFont";
    }

    @RequestMapping(value = "/tagFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagFont " + id;
    }

    @RequestMapping(value = "/tagFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagFont " + id;
    }
}
