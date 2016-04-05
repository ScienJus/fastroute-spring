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
public class ArticlesActiveController {

    @RequestMapping(value = "/articlesActive", method = GET)
    public String list() {
        return "articlesActive list";
    }

    @RequestMapping(value = "/articlesActive/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesActive detail " + id;
    }

    @RequestMapping(value = "/articlesActive", method = POST)
    public String create() {
        return "create articlesActive";
    }

    @RequestMapping(value = "/articlesActive/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesActive " + id;
    }

    @RequestMapping(value = "/articlesActive/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesActive " + id;
    }
}
