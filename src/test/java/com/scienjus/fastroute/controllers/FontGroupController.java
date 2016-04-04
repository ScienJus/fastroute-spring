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
public class FontGroupController {

    @RequestMapping(value = "/fontGroup", method = GET)
    public String list() {
        return "fontGroup list";
    }

    @RequestMapping(value = "/fontGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontGroup detail " + id;
    }

    @RequestMapping(value = "/fontGroup", method = POST)
    public String create() {
        return "create fontGroup";
    }

    @RequestMapping(value = "/fontGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontGroup " + id;
    }

    @RequestMapping(value = "/fontGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontGroup " + id;
    }
}
