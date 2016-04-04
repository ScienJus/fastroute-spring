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
public class ActiveUserController {

    @RequestMapping(value = "/activeUser", method = GET)
    public String list() {
        return "activeUser list";
    }

    @RequestMapping(value = "/activeUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activeUser detail " + id;
    }

    @RequestMapping(value = "/activeUser", method = POST)
    public String create() {
        return "create activeUser";
    }

    @RequestMapping(value = "/activeUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activeUser " + id;
    }

    @RequestMapping(value = "/activeUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activeUser " + id;
    }
}
