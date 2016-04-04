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
public class PostArticlesController {

    @RequestMapping(value = "/postArticles", method = GET)
    public String list() {
        return "postArticles list";
    }

    @RequestMapping(value = "/postArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postArticles detail " + id;
    }

    @RequestMapping(value = "/postArticles", method = POST)
    public String create() {
        return "create postArticles";
    }

    @RequestMapping(value = "/postArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postArticles " + id;
    }

    @RequestMapping(value = "/postArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postArticles " + id;
    }
}
