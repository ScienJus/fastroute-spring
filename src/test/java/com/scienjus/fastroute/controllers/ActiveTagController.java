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
public class ActiveTagController {

    @RequestMapping(value = "/activeTag", method = GET)
    public String list() {
        return "activeTag list";
    }

    @RequestMapping(value = "/activeTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activeTag detail " + id;
    }

    @RequestMapping(value = "/activeTag", method = POST)
    public String create() {
        return "create activeTag";
    }

    @RequestMapping(value = "/activeTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activeTag " + id;
    }

    @RequestMapping(value = "/activeTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activeTag " + id;
    }
}
