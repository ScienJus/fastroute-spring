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
public class GameFontController {

    @RequestMapping(value = "/gameFont", method = GET)
    public String list() {
        return "gameFont list";
    }

    @RequestMapping(value = "/gameFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gameFont detail " + id;
    }

    @RequestMapping(value = "/gameFont", method = POST)
    public String create() {
        return "create gameFont";
    }

    @RequestMapping(value = "/gameFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gameFont " + id;
    }

    @RequestMapping(value = "/gameFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gameFont " + id;
    }
}
