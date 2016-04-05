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
public class PlaceGameController {

    @RequestMapping(value = "/placeGame", method = GET)
    public String list() {
        return "placeGame list";
    }

    @RequestMapping(value = "/placeGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placeGame detail " + id;
    }

    @RequestMapping(value = "/placeGame", method = POST)
    public String create() {
        return "create placeGame";
    }

    @RequestMapping(value = "/placeGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placeGame " + id;
    }

    @RequestMapping(value = "/placeGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placeGame " + id;
    }
}
