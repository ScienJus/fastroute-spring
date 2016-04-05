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
public class PlaceGroupController {

    @RequestMapping(value = "/placeGroup", method = GET)
    public String list() {
        return "placeGroup list";
    }

    @RequestMapping(value = "/placeGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placeGroup detail " + id;
    }

    @RequestMapping(value = "/placeGroup", method = POST)
    public String create() {
        return "create placeGroup";
    }

    @RequestMapping(value = "/placeGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placeGroup " + id;
    }

    @RequestMapping(value = "/placeGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placeGroup " + id;
    }
}
