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
public class GroupPostController {

    @RequestMapping(value = "/groupPost", method = GET)
    public String list() {
        return "groupPost list";
    }

    @RequestMapping(value = "/groupPost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupPost detail " + id;
    }

    @RequestMapping(value = "/groupPost", method = POST)
    public String create() {
        return "create groupPost";
    }

    @RequestMapping(value = "/groupPost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupPost " + id;
    }

    @RequestMapping(value = "/groupPost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupPost " + id;
    }
}
