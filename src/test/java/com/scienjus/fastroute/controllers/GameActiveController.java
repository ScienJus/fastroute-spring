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
public class GameActiveController {

    @RequestMapping(value = "/gameActive", method = GET)
    public String list() {
        return "gameActive list";
    }

    @RequestMapping(value = "/gameActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gameActive detail " + id;
    }

    @RequestMapping(value = "/gameActive", method = POST)
    public String create() {
        return "create gameActive";
    }

    @RequestMapping(value = "/gameActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gameActive " + id;
    }

    @RequestMapping(value = "/gameActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gameActive " + id;
    }
}
