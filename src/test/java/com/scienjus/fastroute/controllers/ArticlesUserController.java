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
public class ArticlesUserController {

    @RequestMapping(value = "/articlesUser", method = GET)
    public String list() {
        return "articlesUser list";
    }

    @RequestMapping(value = "/articlesUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesUser detail " + id;
    }

    @RequestMapping(value = "/articlesUser", method = POST)
    public String create() {
        return "create articlesUser";
    }

    @RequestMapping(value = "/articlesUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesUser " + id;
    }

    @RequestMapping(value = "/articlesUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesUser " + id;
    }
}
