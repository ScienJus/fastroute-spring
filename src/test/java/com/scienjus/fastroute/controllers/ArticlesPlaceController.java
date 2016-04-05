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
public class ArticlesPlaceController {

    @RequestMapping(value = "/articlesPlace", method = GET)
    public String list() {
        return "articlesPlace list";
    }

    @RequestMapping(value = "/articlesPlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesPlace detail " + id;
    }

    @RequestMapping(value = "/articlesPlace", method = POST)
    public String create() {
        return "create articlesPlace";
    }

    @RequestMapping(value = "/articlesPlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesPlace " + id;
    }

    @RequestMapping(value = "/articlesPlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesPlace " + id;
    }
}
