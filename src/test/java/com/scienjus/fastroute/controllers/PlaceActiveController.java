package com.scienjus.fastroute.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
@RestController
public class PlaceActiveController {

    @RequestMapping(value = "/placeActive", method = GET)
    public String list() {
        return "placeActive list";
    }

    @RequestMapping(value = "/placeActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placeActive detail " + id;
    }

    @RequestMapping(value = "/placeActive", method = POST)
    public String create() {
        return "create placeActive";
    }

    @RequestMapping(value = "/placeActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placeActive " + id;
    }

    @RequestMapping(value = "/placeActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placeActive " + id;
    }
}
