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
public class FontActiveController {

    @RequestMapping(value = "/fontActive", method = GET)
    public String list() {
        return "fontActive list";
    }

    @RequestMapping(value = "/fontActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontActive detail " + id;
    }

    @RequestMapping(value = "/fontActive", method = POST)
    public String create() {
        return "create fontActive";
    }

    @RequestMapping(value = "/fontActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontActive " + id;
    }

    @RequestMapping(value = "/fontActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontActive " + id;
    }
}
