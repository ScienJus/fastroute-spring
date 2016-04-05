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
public class TagImageController {

    @RequestMapping(value = "/tagImage", method = GET)
    public String list() {
        return "tagImage list";
    }

    @RequestMapping(value = "/tagImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagImage detail " + id;
    }

    @RequestMapping(value = "/tagImage", method = POST)
    public String create() {
        return "create tagImage";
    }

    @RequestMapping(value = "/tagImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagImage " + id;
    }

    @RequestMapping(value = "/tagImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagImage " + id;
    }
}
