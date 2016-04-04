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
public class UserArticlesController {

    @RequestMapping(value = "/userArticles", method = GET)
    public String list() {
        return "userArticles list";
    }

    @RequestMapping(value = "/userArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userArticles detail " + id;
    }

    @RequestMapping(value = "/userArticles", method = POST)
    public String create() {
        return "create userArticles";
    }

    @RequestMapping(value = "/userArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userArticles " + id;
    }

    @RequestMapping(value = "/userArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userArticles " + id;
    }
}
