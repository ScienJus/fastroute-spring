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
public class WebGroupController {

    @RequestMapping(value = "/webGroup", method = GET)
    public String list() {
        return "webGroup list";
    }

    @RequestMapping(value = "/webGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webGroup detail " + id;
    }

    @RequestMapping(value = "/webGroup", method = POST)
    public String create() {
        return "create webGroup";
    }

    @RequestMapping(value = "/webGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webGroup " + id;
    }

    @RequestMapping(value = "/webGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webGroup " + id;
    }
}
