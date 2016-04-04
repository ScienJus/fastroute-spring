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
public class PlaceFontController {

    @RequestMapping(value = "/placeFont", method = GET)
    public String list() {
        return "placeFont list";
    }

    @RequestMapping(value = "/placeFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placeFont detail " + id;
    }

    @RequestMapping(value = "/placeFont", method = POST)
    public String create() {
        return "create placeFont";
    }

    @RequestMapping(value = "/placeFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placeFont " + id;
    }

    @RequestMapping(value = "/placeFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placeFont " + id;
    }
}
