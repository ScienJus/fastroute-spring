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
public class UserUserController {

    @RequestMapping(value = "/userUser", method = GET)
    public String list() {
        return "userUser list";
    }

    @RequestMapping(value = "/userUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userUser detail " + id;
    }

    @RequestMapping(value = "/userUser", method = POST)
    public String create() {
        return "create userUser";
    }

    @RequestMapping(value = "/userUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userUser " + id;
    }

    @RequestMapping(value = "/userUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userUser " + id;
    }
}
