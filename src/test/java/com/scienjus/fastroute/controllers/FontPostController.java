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
public class FontPostController {

    @RequestMapping(value = "/fontPost", method = GET)
    public String list() {
        return "fontPost list";
    }

    @RequestMapping(value = "/fontPost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontPost detail " + id;
    }

    @RequestMapping(value = "/fontPost", method = POST)
    public String create() {
        return "create fontPost";
    }

    @RequestMapping(value = "/fontPost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontPost " + id;
    }

    @RequestMapping(value = "/fontPost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontPost " + id;
    }
}
