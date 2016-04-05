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
public class GroupImageController {

    @RequestMapping(value = "/groupImage", method = GET)
    public String list() {
        return "groupImage list";
    }

    @RequestMapping(value = "/groupImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupImage detail " + id;
    }

    @RequestMapping(value = "/groupImage", method = POST)
    public String create() {
        return "create groupImage";
    }

    @RequestMapping(value = "/groupImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupImage " + id;
    }

    @RequestMapping(value = "/groupImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupImage " + id;
    }
}
