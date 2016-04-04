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
public class GroupTagController {

    @RequestMapping(value = "/groupTag", method = GET)
    public String list() {
        return "groupTag list";
    }

    @RequestMapping(value = "/groupTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupTag detail " + id;
    }

    @RequestMapping(value = "/groupTag", method = POST)
    public String create() {
        return "create groupTag";
    }

    @RequestMapping(value = "/groupTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupTag " + id;
    }

    @RequestMapping(value = "/groupTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupTag " + id;
    }
}
