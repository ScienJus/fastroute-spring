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
public class PostUserController {

    @RequestMapping(value = "/postUser", method = GET)
    public String list() {
        return "postUser list";
    }

    @RequestMapping(value = "/postUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postUser detail " + id;
    }

    @RequestMapping(value = "/postUser", method = POST)
    public String create() {
        return "create postUser";
    }

    @RequestMapping(value = "/postUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postUser " + id;
    }

    @RequestMapping(value = "/postUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postUser " + id;
    }
}
