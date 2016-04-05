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
public class FontTagController {

    @RequestMapping(value = "/fontTag", method = GET)
    public String list() {
        return "fontTag list";
    }

    @RequestMapping(value = "/fontTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontTag detail " + id;
    }

    @RequestMapping(value = "/fontTag", method = POST)
    public String create() {
        return "create fontTag";
    }

    @RequestMapping(value = "/fontTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontTag " + id;
    }

    @RequestMapping(value = "/fontTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontTag " + id;
    }
}
