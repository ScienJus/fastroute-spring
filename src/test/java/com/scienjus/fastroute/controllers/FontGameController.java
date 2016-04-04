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
public class FontGameController {

    @RequestMapping(value = "/fontGame", method = GET)
    public String list() {
        return "fontGame list";
    }

    @RequestMapping(value = "/fontGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontGame detail " + id;
    }

    @RequestMapping(value = "/fontGame", method = POST)
    public String create() {
        return "create fontGame";
    }

    @RequestMapping(value = "/fontGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontGame " + id;
    }

    @RequestMapping(value = "/fontGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontGame " + id;
    }
}
