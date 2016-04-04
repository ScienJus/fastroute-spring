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
public class WebActiveController {

    @RequestMapping(value = "/webActive", method = GET)
    public String list() {
        return "webActive list";
    }

    @RequestMapping(value = "/webActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webActive detail " + id;
    }

    @RequestMapping(value = "/webActive", method = POST)
    public String create() {
        return "create webActive";
    }

    @RequestMapping(value = "/webActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webActive " + id;
    }

    @RequestMapping(value = "/webActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webActive " + id;
    }
}
