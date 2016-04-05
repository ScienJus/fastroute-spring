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
public class WebArticlesController {

    @RequestMapping(value = "/webArticles", method = GET)
    public String list() {
        return "webArticles list";
    }

    @RequestMapping(value = "/webArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "webArticles detail " + id;
    }

    @RequestMapping(value = "/webArticles", method = POST)
    public String create() {
        return "create webArticles";
    }

    @RequestMapping(value = "/webArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify webArticles " + id;
    }

    @RequestMapping(value = "/webArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete webArticles " + id;
    }
}
