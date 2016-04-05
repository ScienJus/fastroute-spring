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
public class GameWebController {

    @RequestMapping(value = "/gameWeb", method = GET)
    public String list() {
        return "gameWeb list";
    }

    @RequestMapping(value = "/gameWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gameWeb detail " + id;
    }

    @RequestMapping(value = "/gameWeb", method = POST)
    public String create() {
        return "create gameWeb";
    }

    @RequestMapping(value = "/gameWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gameWeb " + id;
    }

    @RequestMapping(value = "/gameWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gameWeb " + id;
    }
}
