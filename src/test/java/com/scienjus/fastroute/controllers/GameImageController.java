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
public class GameImageController {

    @RequestMapping(value = "/gameImage", method = GET)
    public String list() {
        return "gameImage list";
    }

    @RequestMapping(value = "/gameImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gameImage detail " + id;
    }

    @RequestMapping(value = "/gameImage", method = POST)
    public String create() {
        return "create gameImage";
    }

    @RequestMapping(value = "/gameImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gameImage " + id;
    }

    @RequestMapping(value = "/gameImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gameImage " + id;
    }
}
