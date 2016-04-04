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
public class FontArticlesController {

    @RequestMapping(value = "/fontArticles", method = GET)
    public String list() {
        return "fontArticles list";
    }

    @RequestMapping(value = "/fontArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontArticles detail " + id;
    }

    @RequestMapping(value = "/fontArticles", method = POST)
    public String create() {
        return "create fontArticles";
    }

    @RequestMapping(value = "/fontArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontArticles " + id;
    }

    @RequestMapping(value = "/fontArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontArticles " + id;
    }
}
