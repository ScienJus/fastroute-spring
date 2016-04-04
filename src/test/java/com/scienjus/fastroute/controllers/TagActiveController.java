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
public class TagActiveController {

    @RequestMapping(value = "/tagActive", method = GET)
    public String list() {
        return "tagActive list";
    }

    @RequestMapping(value = "/tagActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagActive detail " + id;
    }

    @RequestMapping(value = "/tagActive", method = POST)
    public String create() {
        return "create tagActive";
    }

    @RequestMapping(value = "/tagActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagActive " + id;
    }

    @RequestMapping(value = "/tagActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagActive " + id;
    }
}
