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
public class ArticlesGroupController {

    @RequestMapping(value = "/articlesGroup", method = GET)
    public String list() {
        return "articlesGroup list";
    }

    @RequestMapping(value = "/articlesGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesGroup detail " + id;
    }

    @RequestMapping(value = "/articlesGroup", method = POST)
    public String create() {
        return "create articlesGroup";
    }

    @RequestMapping(value = "/articlesGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesGroup " + id;
    }

    @RequestMapping(value = "/articlesGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesGroup " + id;
    }
}
