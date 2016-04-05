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
public class PostGameController {

    @RequestMapping(value = "/postGame", method = GET)
    public String list() {
        return "postGame list";
    }

    @RequestMapping(value = "/postGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postGame detail " + id;
    }

    @RequestMapping(value = "/postGame", method = POST)
    public String create() {
        return "create postGame";
    }

    @RequestMapping(value = "/postGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postGame " + id;
    }

    @RequestMapping(value = "/postGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postGame " + id;
    }
}
