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
public class GameTagController {

    @RequestMapping(value = "/gameTag", method = GET)
    public String list() {
        return "gameTag list";
    }

    @RequestMapping(value = "/gameTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gameTag detail " + id;
    }

    @RequestMapping(value = "/gameTag", method = POST)
    public String create() {
        return "create gameTag";
    }

    @RequestMapping(value = "/gameTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gameTag " + id;
    }

    @RequestMapping(value = "/gameTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gameTag " + id;
    }
}
