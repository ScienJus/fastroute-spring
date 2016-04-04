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
public class PlacePlaceController {

    @RequestMapping(value = "/placePlace", method = GET)
    public String list() {
        return "placePlace list";
    }

    @RequestMapping(value = "/placePlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placePlace detail " + id;
    }

    @RequestMapping(value = "/placePlace", method = POST)
    public String create() {
        return "create placePlace";
    }

    @RequestMapping(value = "/placePlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placePlace " + id;
    }

    @RequestMapping(value = "/placePlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placePlace " + id;
    }
}
