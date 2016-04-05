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
public class PostWebController {

    @RequestMapping(value = "/postWeb", method = GET)
    public String list() {
        return "postWeb list";
    }

    @RequestMapping(value = "/postWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postWeb detail " + id;
    }

    @RequestMapping(value = "/postWeb", method = POST)
    public String create() {
        return "create postWeb";
    }

    @RequestMapping(value = "/postWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postWeb " + id;
    }

    @RequestMapping(value = "/postWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postWeb " + id;
    }
}
