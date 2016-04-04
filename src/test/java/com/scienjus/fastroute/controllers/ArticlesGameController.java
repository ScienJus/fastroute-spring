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
public class ArticlesGameController {

    @RequestMapping(value = "/articlesGame", method = GET)
    public String list() {
        return "articlesGame list";
    }

    @RequestMapping(value = "/articlesGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesGame detail " + id;
    }

    @RequestMapping(value = "/articlesGame", method = POST)
    public String create() {
        return "create articlesGame";
    }

    @RequestMapping(value = "/articlesGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesGame " + id;
    }

    @RequestMapping(value = "/articlesGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesGame " + id;
    }
}
