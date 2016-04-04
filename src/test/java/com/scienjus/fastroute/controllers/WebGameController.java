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
public class WebGameController {

    @RequestMapping(value = "/webGame", method = GET)
    public String list() {
        return "webGame list";
    }

    @RequestMapping(value = "/webGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webGame detail " + id;
    }

    @RequestMapping(value = "/webGame", method = POST)
    public String create() {
        return "create webGame";
    }

    @RequestMapping(value = "/webGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webGame " + id;
    }

    @RequestMapping(value = "/webGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webGame " + id;
    }
}
