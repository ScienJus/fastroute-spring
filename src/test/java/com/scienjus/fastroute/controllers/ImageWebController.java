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
public class ImageWebController {

    @RequestMapping(value = "/imageWeb", method = GET)
    public String list() {
        return "imageWeb list";
    }

    @RequestMapping(value = "/imageWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imageWeb detail " + id;
    }

    @RequestMapping(value = "/imageWeb", method = POST)
    public String create() {
        return "create imageWeb";
    }

    @RequestMapping(value = "/imageWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imageWeb " + id;
    }

    @RequestMapping(value = "/imageWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imageWeb " + id;
    }
}
