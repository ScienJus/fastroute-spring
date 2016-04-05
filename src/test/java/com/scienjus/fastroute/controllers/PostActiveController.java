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
public class PostActiveController {

    @RequestMapping(value = "/postActive", method = GET)
    public String list() {
        return "postActive list";
    }

    @RequestMapping(value = "/postActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postActive detail " + id;
    }

    @RequestMapping(value = "/postActive", method = POST)
    public String create() {
        return "create postActive";
    }

    @RequestMapping(value = "/postActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postActive " + id;
    }

    @RequestMapping(value = "/postActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postActive " + id;
    }
}
