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
public class UserActiveController {

    @RequestMapping(value = "/userActive", method = GET)
    public String list() {
        return "userActive list";
    }

    @RequestMapping(value = "/userActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userActive detail " + id;
    }

    @RequestMapping(value = "/userActive", method = POST)
    public String create() {
        return "create userActive";
    }

    @RequestMapping(value = "/userActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userActive " + id;
    }

    @RequestMapping(value = "/userActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userActive " + id;
    }
}
