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
public class GroupFontController {

    @RequestMapping(value = "/groupFont", method = GET)
    public String list() {
        return "groupFont list";
    }

    @RequestMapping(value = "/groupFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupFont detail " + id;
    }

    @RequestMapping(value = "/groupFont", method = POST)
    public String create() {
        return "create groupFont";
    }

    @RequestMapping(value = "/groupFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupFont " + id;
    }

    @RequestMapping(value = "/groupFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupFont " + id;
    }
}
