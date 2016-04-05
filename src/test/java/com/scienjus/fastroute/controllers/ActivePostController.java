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
public class ActivePostController {

    @RequestMapping(value = "/activePost", method = GET)
    public String list() {
        return "activePost list";
    }

    @RequestMapping(value = "/activePost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activePost detail " + id;
    }

    @RequestMapping(value = "/activePost", method = POST)
    public String create() {
        return "create activePost";
    }

    @RequestMapping(value = "/activePost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activePost " + id;
    }

    @RequestMapping(value = "/activePost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activePost " + id;
    }
}
