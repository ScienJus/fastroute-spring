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
public class ImageTagController {

    @RequestMapping(value = "/imageTag", method = GET)
    public String list() {
        return "imageTag list";
    }

    @RequestMapping(value = "/imageTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imageTag detail " + id;
    }

    @RequestMapping(value = "/imageTag", method = POST)
    public String create() {
        return "create imageTag";
    }

    @RequestMapping(value = "/imageTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imageTag " + id;
    }

    @RequestMapping(value = "/imageTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imageTag " + id;
    }
}
