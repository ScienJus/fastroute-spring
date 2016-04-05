package com.scienjus.fastroute.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
@RestController
public class TagArticlesController {

    @RequestMapping(value = "/tagArticles", method = GET)
    public String list() {
        return "tagArticles list";
    }

    @RequestMapping(value = "/tagArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagArticles detail " + id;
    }

    @RequestMapping(value = "/tagArticles", method = POST)
    public String create() {
        return "create tagArticles";
    }

    @RequestMapping(value = "/tagArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagArticles " + id;
    }

    @RequestMapping(value = "/tagArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagArticles " + id;
    }
}
