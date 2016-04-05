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
public class TagUserController {

    @RequestMapping(value = "/tagUser", method = GET)
    public String list() {
        return "tagUser list";
    }

    @RequestMapping(value = "/tagUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagUser detail " + id;
    }

    @RequestMapping(value = "/tagUser", method = POST)
    public String create() {
        return "create tagUser";
    }

    @RequestMapping(value = "/tagUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagUser " + id;
    }

    @RequestMapping(value = "/tagUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagUser " + id;
    }
}
