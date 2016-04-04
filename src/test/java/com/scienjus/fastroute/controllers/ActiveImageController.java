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
public class ActiveImageController {

    @RequestMapping(value = "/activeImage", method = GET)
    public String list() {
        return "activeImage list";
    }

    @RequestMapping(value = "/activeImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activeImage detail " + id;
    }

    @RequestMapping(value = "/activeImage", method = POST)
    public String create() {
        return "create activeImage";
    }

    @RequestMapping(value = "/activeImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activeImage " + id;
    }

    @RequestMapping(value = "/activeImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activeImage " + id;
    }
}
