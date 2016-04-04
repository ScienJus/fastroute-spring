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
public class ImageActiveController {

    @RequestMapping(value = "/imageActive", method = GET)
    public String list() {
        return "imageActive list";
    }

    @RequestMapping(value = "/imageActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imageActive detail " + id;
    }

    @RequestMapping(value = "/imageActive", method = POST)
    public String create() {
        return "create imageActive";
    }

    @RequestMapping(value = "/imageActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imageActive " + id;
    }

    @RequestMapping(value = "/imageActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imageActive " + id;
    }
}
