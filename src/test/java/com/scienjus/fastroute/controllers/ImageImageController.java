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
public class ImageImageController {

    @RequestMapping(value = "/imageImage", method = GET)
    public String list() {
        return "imageImage list";
    }

    @RequestMapping(value = "/imageImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imageImage detail " + id;
    }

    @RequestMapping(value = "/imageImage", method = POST)
    public String create() {
        return "create imageImage";
    }

    @RequestMapping(value = "/imageImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imageImage " + id;
    }

    @RequestMapping(value = "/imageImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imageImage " + id;
    }
}
