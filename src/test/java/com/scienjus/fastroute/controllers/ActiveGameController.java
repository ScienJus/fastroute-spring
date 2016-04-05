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
public class ActiveGameController {

    @RequestMapping(value = "/activeGame", method = GET)
    public String list() {
        return "activeGame list";
    }

    @RequestMapping(value = "/activeGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activeGame detail " + id;
    }

    @RequestMapping(value = "/activeGame", method = POST)
    public String create() {
        return "create activeGame";
    }

    @RequestMapping(value = "/activeGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activeGame " + id;
    }

    @RequestMapping(value = "/activeGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activeGame " + id;
    }
}
