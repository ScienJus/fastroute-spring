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
public class ArticlesFontController {

    @RequestMapping(value = "/articlesFont", method = GET)
    public String list() {
        return "articlesFont list";
    }

    @RequestMapping(value = "/articlesFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesFont detail " + id;
    }

    @RequestMapping(value = "/articlesFont", method = POST)
    public String create() {
        return "create articlesFont";
    }

    @RequestMapping(value = "/articlesFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesFont " + id;
    }

    @RequestMapping(value = "/articlesFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesFont " + id;
    }
}
