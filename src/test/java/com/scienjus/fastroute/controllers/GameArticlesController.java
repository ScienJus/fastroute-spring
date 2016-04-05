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
public class GameArticlesController {

    @RequestMapping(value = "/gameArticles", method = GET)
    public String list() {
        return "gameArticles list";
    }

    @RequestMapping(value = "/gameArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gameArticles detail " + id;
    }

    @RequestMapping(value = "/gameArticles", method = POST)
    public String create() {
        return "create gameArticles";
    }

    @RequestMapping(value = "/gameArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gameArticles " + id;
    }

    @RequestMapping(value = "/gameArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gameArticles " + id;
    }
}
