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
public class WebFontController {

    @RequestMapping(value = "/webFont", method = GET)
    public String list() {
        return "webFont list";
    }

    @RequestMapping(value = "/webFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webFont detail " + id;
    }

    @RequestMapping(value = "/webFont", method = POST)
    public String create() {
        return "create webFont";
    }

    @RequestMapping(value = "/webFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webFont " + id;
    }

    @RequestMapping(value = "/webFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webFont " + id;
    }
}
