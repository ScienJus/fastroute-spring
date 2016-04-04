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
public class PlacePostController {

    @RequestMapping(value = "/placePost", method = GET)
    public String list() {
        return "placePost list";
    }

    @RequestMapping(value = "/placePost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placePost detail " + id;
    }

    @RequestMapping(value = "/placePost", method = POST)
    public String create() {
        return "create placePost";
    }

    @RequestMapping(value = "/placePost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placePost " + id;
    }

    @RequestMapping(value = "/placePost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placePost " + id;
    }
}
