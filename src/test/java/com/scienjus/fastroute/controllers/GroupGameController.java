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
public class GroupGameController {

    @RequestMapping(value = "/groupGame", method = GET)
    public String list() {
        return "groupGame list";
    }

    @RequestMapping(value = "/groupGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupGame detail " + id;
    }

    @RequestMapping(value = "/groupGame", method = POST)
    public String create() {
        return "create groupGame";
    }

    @RequestMapping(value = "/groupGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupGame " + id;
    }

    @RequestMapping(value = "/groupGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupGame " + id;
    }
}
