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
public class GroupWebController {

    @RequestMapping(value = "/groupWeb", method = GET)
    public String list() {
        return "groupWeb list";
    }

    @RequestMapping(value = "/groupWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupWeb detail " + id;
    }

    @RequestMapping(value = "/groupWeb", method = POST)
    public String create() {
        return "create groupWeb";
    }

    @RequestMapping(value = "/groupWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupWeb " + id;
    }

    @RequestMapping(value = "/groupWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupWeb " + id;
    }
}
