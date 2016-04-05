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
public class WebTagController {

    @RequestMapping(value = "/webTag", method = GET)
    public String list() {
        return "webTag list";
    }

    @RequestMapping(value = "/webTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webTag detail " + id;
    }

    @RequestMapping(value = "/webTag", method = POST)
    public String create() {
        return "create webTag";
    }

    @RequestMapping(value = "/webTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webTag " + id;
    }

    @RequestMapping(value = "/webTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webTag " + id;
    }
}
