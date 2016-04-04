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
public class UserPostController {

    @RequestMapping(value = "/userPost", method = GET)
    public String list() {
        return "userPost list";
    }

    @RequestMapping(value = "/userPost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userPost detail " + id;
    }

    @RequestMapping(value = "/userPost", method = POST)
    public String create() {
        return "create userPost";
    }

    @RequestMapping(value = "/userPost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userPost " + id;
    }

    @RequestMapping(value = "/userPost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userPost " + id;
    }
}
