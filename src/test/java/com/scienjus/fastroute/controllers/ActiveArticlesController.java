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
public class ActiveArticlesController {

    @RequestMapping(value = "/activeArticles", method = GET)
    public String list() {
        return "activeArticles list";
    }

    @RequestMapping(value = "/activeArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activeArticles detail " + id;
    }

    @RequestMapping(value = "/activeArticles", method = POST)
    public String create() {
        return "create activeArticles";
    }

    @RequestMapping(value = "/activeArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activeArticles " + id;
    }

    @RequestMapping(value = "/activeArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activeArticles " + id;
    }
}
