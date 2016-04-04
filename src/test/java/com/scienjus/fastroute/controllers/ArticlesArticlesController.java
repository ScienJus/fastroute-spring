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
public class ArticlesArticlesController {

    @RequestMapping(value = "/articlesArticles", method = GET)
    public String list() {
        return "articlesArticles list";
    }

    @RequestMapping(value = "/articlesArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesArticles detail " + id;
    }

    @RequestMapping(value = "/articlesArticles", method = POST)
    public String create() {
        return "create articlesArticles";
    }

    @RequestMapping(value = "/articlesArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesArticles " + id;
    }

    @RequestMapping(value = "/articlesArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesArticles " + id;
    }
}
