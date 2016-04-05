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
public class WebUserController {

    @RequestMapping(value = "/webUser", method = GET)
    public String list() {
        return "webUser list";
    }

    @RequestMapping(value = "/webUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webUser detail " + id;
    }

    @RequestMapping(value = "/webUser", method = POST)
    public String create() {
        return "create webUser";
    }

    @RequestMapping(value = "/webUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webUser " + id;
    }

    @RequestMapping(value = "/webUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webUser " + id;
    }
}
