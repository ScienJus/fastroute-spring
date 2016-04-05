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
public class PostPostController {

    @RequestMapping(value = "/postPost", method = GET)
    public String list() {
        return "postPost list";
    }

    @RequestMapping(value = "/postPost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postPost detail " + id;
    }

    @RequestMapping(value = "/postPost", method = POST)
    public String create() {
        return "create postPost";
    }

    @RequestMapping(value = "/postPost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postPost " + id;
    }

    @RequestMapping(value = "/postPost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postPost " + id;
    }
}
