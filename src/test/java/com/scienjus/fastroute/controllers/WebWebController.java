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
public class WebWebController {

    @RequestMapping(value = "/webWeb", method = GET)
    public String list() {
        return "webWeb list";
    }

    @RequestMapping(value = "/webWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webWeb detail " + id;
    }

    @RequestMapping(value = "/webWeb", method = POST)
    public String create() {
        return "create webWeb";
    }

    @RequestMapping(value = "/webWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webWeb " + id;
    }

    @RequestMapping(value = "/webWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webWeb " + id;
    }
}
