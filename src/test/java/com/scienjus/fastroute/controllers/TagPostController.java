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
public class TagPostController {

    @RequestMapping(value = "/tagPost", method = GET)
    public String list() {
        return "tagPost list";
    }

    @RequestMapping(value = "/tagPost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagPost detail " + id;
    }

    @RequestMapping(value = "/tagPost", method = POST)
    public String create() {
        return "create tagPost";
    }

    @RequestMapping(value = "/tagPost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagPost " + id;
    }

    @RequestMapping(value = "/tagPost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagPost " + id;
    }
}