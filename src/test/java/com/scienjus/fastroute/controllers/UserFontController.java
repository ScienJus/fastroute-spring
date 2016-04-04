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
public class UserFontController {

    @RequestMapping(value = "/userFont", method = GET)
    public String list() {
        return "userFont list";
    }

    @RequestMapping(value = "/userFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userFont detail " + id;
    }

    @RequestMapping(value = "/userFont", method = POST)
    public String create() {
        return "create userFont";
    }

    @RequestMapping(value = "/userFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userFont " + id;
    }

    @RequestMapping(value = "/userFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userFont " + id;
    }
}
