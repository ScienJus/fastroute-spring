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
public class FontImageController {

    @RequestMapping(value = "/fontImage", method = GET)
    public String list() {
        return "fontImage list";
    }

    @RequestMapping(value = "/fontImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontImage detail " + id;
    }

    @RequestMapping(value = "/fontImage", method = POST)
    public String create() {
        return "create fontImage";
    }

    @RequestMapping(value = "/fontImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontImage " + id;
    }

    @RequestMapping(value = "/fontImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontImage " + id;
    }
}
