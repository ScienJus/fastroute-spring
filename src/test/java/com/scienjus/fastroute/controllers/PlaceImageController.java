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
public class PlaceImageController {

    @RequestMapping(value = "/placeImage", method = GET)
    public String list() {
        return "placeImage list";
    }

    @RequestMapping(value = "/placeImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placeImage detail " + id;
    }

    @RequestMapping(value = "/placeImage", method = POST)
    public String create() {
        return "create placeImage";
    }

    @RequestMapping(value = "/placeImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placeImage " + id;
    }

    @RequestMapping(value = "/placeImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placeImage " + id;
    }
}
