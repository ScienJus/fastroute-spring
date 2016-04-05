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
public class PostTagController {

    @RequestMapping(value = "/postTag", method = GET)
    public String list() {
        return "postTag list";
    }

    @RequestMapping(value = "/postTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postTag detail " + id;
    }

    @RequestMapping(value = "/postTag", method = POST)
    public String create() {
        return "create postTag";
    }

    @RequestMapping(value = "/postTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postTag " + id;
    }

    @RequestMapping(value = "/postTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postTag " + id;
    }
}
