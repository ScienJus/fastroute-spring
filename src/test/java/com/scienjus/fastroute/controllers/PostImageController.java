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
public class PostImageController {

    @RequestMapping(value = "/postImage", method = GET)
    public String list() {
        return "postImage list";
    }

    @RequestMapping(value = "/postImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postImage detail " + id;
    }

    @RequestMapping(value = "/postImage", method = POST)
    public String create() {
        return "create postImage";
    }

    @RequestMapping(value = "/postImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postImage " + id;
    }

    @RequestMapping(value = "/postImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postImage " + id;
    }
}
