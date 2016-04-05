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
public class ActiveGroupController {

    @RequestMapping(value = "/activeGroup", method = GET)
    public String list() {
        return "activeGroup list";
    }

    @RequestMapping(value = "/activeGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activeGroup detail " + id;
    }

    @RequestMapping(value = "/activeGroup", method = POST)
    public String create() {
        return "create activeGroup";
    }

    @RequestMapping(value = "/activeGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activeGroup " + id;
    }

    @RequestMapping(value = "/activeGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activeGroup " + id;
    }
}
