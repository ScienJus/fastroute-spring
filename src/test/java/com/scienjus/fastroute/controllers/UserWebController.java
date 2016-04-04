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
public class UserWebController {

    @RequestMapping(value = "/userWeb", method = GET)
    public String list() {
        return "userWeb list";
    }

    @RequestMapping(value = "/userWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userWeb detail " + id;
    }

    @RequestMapping(value = "/userWeb", method = POST)
    public String create() {
        return "create userWeb";
    }

    @RequestMapping(value = "/userWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userWeb " + id;
    }

    @RequestMapping(value = "/userWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userWeb " + id;
    }
}
