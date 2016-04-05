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
public class PlaceArticlesController {

    @RequestMapping(value = "/placeArticles", method = GET)
    public String list() {
        return "placeArticles list";
    }

    @RequestMapping(value = "/placeArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "placeArticles detail " + id;
    }

    @RequestMapping(value = "/placeArticles", method = POST)
    public String create() {
        return "create placeArticles";
    }

    @RequestMapping(value = "/placeArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify placeArticles " + id;
    }

    @RequestMapping(value = "/placeArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete placeArticles " + id;
    }
}
