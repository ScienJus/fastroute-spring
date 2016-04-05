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
public class GroupArticlesController {

    @RequestMapping(value = "/groupArticles", method = GET)
    public String list() {
        return "groupArticles list";
    }

    @RequestMapping(value = "/groupArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupArticles detail " + id;
    }

    @RequestMapping(value = "/groupArticles", method = POST)
    public String create() {
        return "create groupArticles";
    }

    @RequestMapping(value = "/groupArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupArticles " + id;
    }

    @RequestMapping(value = "/groupArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupArticles " + id;
    }
}
