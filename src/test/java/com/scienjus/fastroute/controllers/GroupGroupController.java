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
public class GroupGroupController {

    @RequestMapping(value = "/groupGroup", method = GET)
    public String list() {
        return "groupGroup list";
    }

    @RequestMapping(value = "/groupGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupGroup detail " + id;
    }

    @RequestMapping(value = "/groupGroup", method = POST)
    public String create() {
        return "create groupGroup";
    }

    @RequestMapping(value = "/groupGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupGroup " + id;
    }

    @RequestMapping(value = "/groupGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupGroup " + id;
    }
}
