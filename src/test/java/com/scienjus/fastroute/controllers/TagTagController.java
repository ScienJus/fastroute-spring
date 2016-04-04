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
public class TagTagController {

    @RequestMapping(value = "/tagTag", method = GET)
    public String list() {
        return "tagTag list";
    }

    @RequestMapping(value = "/tagTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagTag detail " + id;
    }

    @RequestMapping(value = "/tagTag", method = POST)
    public String create() {
        return "create tagTag";
    }

    @RequestMapping(value = "/tagTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagTag " + id;
    }

    @RequestMapping(value = "/tagTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagTag " + id;
    }
}
