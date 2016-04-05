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
public class GroupUserController {

    @RequestMapping(value = "/groupUser", method = GET)
    public String list() {
        return "groupUser list";
    }

    @RequestMapping(value = "/groupUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupUser detail " + id;
    }

    @RequestMapping(value = "/groupUser", method = POST)
    public String create() {
        return "create groupUser";
    }

    @RequestMapping(value = "/groupUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupUser " + id;
    }

    @RequestMapping(value = "/groupUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupUser " + id;
    }
}
