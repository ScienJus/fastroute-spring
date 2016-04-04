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
public class PlaceWebController {

    @RequestMapping(value = "/placeWeb", method = GET)
    public String list() {
        return "placeWeb list";
    }

    @RequestMapping(value = "/placeWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placeWeb detail " + id;
    }

    @RequestMapping(value = "/placeWeb", method = POST)
    public String create() {
        return "create placeWeb";
    }

    @RequestMapping(value = "/placeWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placeWeb " + id;
    }

    @RequestMapping(value = "/placeWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placeWeb " + id;
    }
}
