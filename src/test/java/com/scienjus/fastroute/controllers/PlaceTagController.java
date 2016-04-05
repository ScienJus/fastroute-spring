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
public class PlaceTagController {

    @RequestMapping(value = "/placeTag", method = GET)
    public String list() {
        return "placeTag list";
    }

    @RequestMapping(value = "/placeTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placeTag detail " + id;
    }

    @RequestMapping(value = "/placeTag", method = POST)
    public String create() {
        return "create placeTag";
    }

    @RequestMapping(value = "/placeTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placeTag " + id;
    }

    @RequestMapping(value = "/placeTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placeTag " + id;
    }
}
