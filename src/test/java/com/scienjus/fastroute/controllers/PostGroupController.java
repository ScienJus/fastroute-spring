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
public class PostGroupController {

    @RequestMapping(value = "/postGroup", method = GET)
    public String list() {
        return "postGroup list";
    }

    @RequestMapping(value = "/postGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postGroup detail " + id;
    }

    @RequestMapping(value = "/postGroup", method = POST)
    public String create() {
        return "create postGroup";
    }

    @RequestMapping(value = "/postGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postGroup " + id;
    }

    @RequestMapping(value = "/postGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postGroup " + id;
    }
}
