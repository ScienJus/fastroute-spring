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
public class ActiveActiveController {

    @RequestMapping(value = "/activeActive", method = GET)
    public String list() {
        return "activeActive list";
    }

    @RequestMapping(value = "/activeActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activeActive detail " + id;
    }

    @RequestMapping(value = "/activeActive", method = POST)
    public String create() {
        return "create activeActive";
    }

    @RequestMapping(value = "/activeActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activeActive " + id;
    }

    @RequestMapping(value = "/activeActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activeActive " + id;
    }
}
