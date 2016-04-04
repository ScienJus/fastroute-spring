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
public class GameGameController {

    @RequestMapping(value = "/gameGame", method = GET)
    public String list() {
        return "gameGame list";
    }

    @RequestMapping(value = "/gameGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gameGame detail " + id;
    }

    @RequestMapping(value = "/gameGame", method = POST)
    public String create() {
        return "create gameGame";
    }

    @RequestMapping(value = "/gameGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gameGame " + id;
    }

    @RequestMapping(value = "/gameGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gameGame " + id;
    }
}
