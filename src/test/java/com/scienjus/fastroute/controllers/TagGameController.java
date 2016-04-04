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
public class TagGameController {

    @RequestMapping(value = "/tagGame", method = GET)
    public String list() {
        return "tagGame list";
    }

    @RequestMapping(value = "/tagGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagGame detail " + id;
    }

    @RequestMapping(value = "/tagGame", method = POST)
    public String create() {
        return "create tagGame";
    }

    @RequestMapping(value = "/tagGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagGame " + id;
    }

    @RequestMapping(value = "/tagGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagGame " + id;
    }
}
