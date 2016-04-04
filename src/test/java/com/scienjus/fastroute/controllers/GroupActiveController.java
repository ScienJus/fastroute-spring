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
public class GroupActiveController {

    @RequestMapping(value = "/groupActive", method = GET)
    public String list() {
        return "groupActive list";
    }

    @RequestMapping(value = "/groupActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupActive detail " + id;
    }

    @RequestMapping(value = "/groupActive", method = POST)
    public String create() {
        return "create groupActive";
    }

    @RequestMapping(value = "/groupActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupActive " + id;
    }

    @RequestMapping(value = "/groupActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupActive " + id;
    }
}
