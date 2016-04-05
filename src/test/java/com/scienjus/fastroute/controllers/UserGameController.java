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
public class UserGameController {

    @RequestMapping(value = "/userGame", method = GET)
    public String list() {
        return "userGame list";
    }

    @RequestMapping(value = "/userGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userGame detail " + id;
    }

    @RequestMapping(value = "/userGame", method = POST)
    public String create() {
        return "create userGame";
    }

    @RequestMapping(value = "/userGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userGame " + id;
    }

    @RequestMapping(value = "/userGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userGame " + id;
    }
}
