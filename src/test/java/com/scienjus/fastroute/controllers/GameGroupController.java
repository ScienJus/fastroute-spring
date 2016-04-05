package com.scienjus.fastroute.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
@RestController
public class GameGroupController {

    @RequestMapping(value = "/gameGroup", method = GET)
    public String list() {
        return "gameGroup list";
    }

    @RequestMapping(value = "/gameGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gameGroup detail " + id;
    }

    @RequestMapping(value = "/gameGroup", method = POST)
    public String create() {
        return "create gameGroup";
    }

    @RequestMapping(value = "/gameGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gameGroup " + id;
    }

    @RequestMapping(value = "/gameGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gameGroup " + id;
    }
}
