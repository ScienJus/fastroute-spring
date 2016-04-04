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
public class ArticlesImageController {

    @RequestMapping(value = "/articlesImage", method = GET)
    public String list() {
        return "articlesImage list";
    }

    @RequestMapping(value = "/articlesImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesImage detail " + id;
    }

    @RequestMapping(value = "/articlesImage", method = POST)
    public String create() {
        return "create articlesImage";
    }

    @RequestMapping(value = "/articlesImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesImage " + id;
    }

    @RequestMapping(value = "/articlesImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesImage " + id;
    }
}
