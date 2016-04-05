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
public class FontWebController {

    @RequestMapping(value = "/fontWeb", method = GET)
    public String list() {
        return "fontWeb list";
    }

    @RequestMapping(value = "/fontWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontWeb detail " + id;
    }

    @RequestMapping(value = "/fontWeb", method = POST)
    public String create() {
        return "create fontWeb";
    }

    @RequestMapping(value = "/fontWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontWeb " + id;
    }

    @RequestMapping(value = "/fontWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontWeb " + id;
    }
}
