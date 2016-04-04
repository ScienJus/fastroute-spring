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
public class PostFontController {

    @RequestMapping(value = "/postFont", method = GET)
    public String list() {
        return "postFont list";
    }

    @RequestMapping(value = "/postFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postFont detail " + id;
    }

    @RequestMapping(value = "/postFont", method = POST)
    public String create() {
        return "create postFont";
    }

    @RequestMapping(value = "/postFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postFont " + id;
    }

    @RequestMapping(value = "/postFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postFont " + id;
    }
}
