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
public class UserTagController {

    @RequestMapping(value = "/userTag", method = GET)
    public String list() {
        return "userTag list";
    }

    @RequestMapping(value = "/userTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userTag detail " + id;
    }

    @RequestMapping(value = "/userTag", method = POST)
    public String create() {
        return "create userTag";
    }

    @RequestMapping(value = "/userTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userTag " + id;
    }

    @RequestMapping(value = "/userTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userTag " + id;
    }
}
