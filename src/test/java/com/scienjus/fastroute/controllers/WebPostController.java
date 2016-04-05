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
public class WebPostController {

    @RequestMapping(value = "/webPost", method = GET)
    public String list() {
        return "webPost list";
    }

    @RequestMapping(value = "/webPost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webPost detail " + id;
    }

    @RequestMapping(value = "/webPost", method = POST)
    public String create() {
        return "create webPost";
    }

    @RequestMapping(value = "/webPost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webPost " + id;
    }

    @RequestMapping(value = "/webPost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webPost " + id;
    }
}
