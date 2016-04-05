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
public class WebPlaceController {

    @RequestMapping(value = "/webPlace", method = GET)
    public String list() {
        return "webPlace list";
    }

    @RequestMapping(value = "/webPlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webPlace detail " + id;
    }

    @RequestMapping(value = "/webPlace", method = POST)
    public String create() {
        return "create webPlace";
    }

    @RequestMapping(value = "/webPlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webPlace " + id;
    }

    @RequestMapping(value = "/webPlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webPlace " + id;
    }
}
