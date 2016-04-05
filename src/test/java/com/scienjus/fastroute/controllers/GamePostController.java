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
public class GamePostController {

    @RequestMapping(value = "/gamePost", method = GET)
    public String list() {
        return "gamePost list";
    }

    @RequestMapping(value = "/gamePost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gamePost detail " + id;
    }

    @RequestMapping(value = "/gamePost", method = POST)
    public String create() {
        return "create gamePost";
    }

    @RequestMapping(value = "/gamePost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gamePost " + id;
    }

    @RequestMapping(value = "/gamePost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gamePost " + id;
    }
}
