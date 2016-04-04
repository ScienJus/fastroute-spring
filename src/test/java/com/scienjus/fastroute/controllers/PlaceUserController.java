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
public class PlaceUserController {

    @RequestMapping(value = "/placeUser", method = GET)
    public String list() {
        return "placeUser list";
    }

    @RequestMapping(value = "/placeUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placeUser detail " + id;
    }

    @RequestMapping(value = "/placeUser", method = POST)
    public String create() {
        return "create placeUser";
    }

    @RequestMapping(value = "/placeUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placeUser " + id;
    }

    @RequestMapping(value = "/placeUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placeUser " + id;
    }
}
