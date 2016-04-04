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
public class ArticlesTagController {

    @RequestMapping(value = "/articlesTag", method = GET)
    public String list() {
        return "articlesTag list";
    }

    @RequestMapping(value = "/articlesTag/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesTag detail " + id;
    }

    @RequestMapping(value = "/articlesTag", method = POST)
    public String create() {
        return "create articlesTag";
    }

    @RequestMapping(value = "/articlesTag/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesTag " + id;
    }

    @RequestMapping(value = "/articlesTag/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesTag " + id;
    }
}
