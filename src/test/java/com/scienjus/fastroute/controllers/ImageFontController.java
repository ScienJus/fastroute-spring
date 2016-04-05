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
public class ImageFontController {

    @RequestMapping(value = "/imageFont", method = GET)
    public String list() {
        return "imageFont list";
    }

    @RequestMapping(value = "/imageFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imageFont detail " + id;
    }

    @RequestMapping(value = "/imageFont", method = POST)
    public String create() {
        return "create imageFont";
    }

    @RequestMapping(value = "/imageFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imageFont " + id;
    }

    @RequestMapping(value = "/imageFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imageFont " + id;
    }
}
