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
public class ImageArticlesController {

    @RequestMapping(value = "/imageArticles", method = GET)
    public String list() {
        return "imageArticles list";
    }

    @RequestMapping(value = "/imageArticles/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imageArticles detail " + id;
    }

    @RequestMapping(value = "/imageArticles", method = POST)
    public String create() {
        return "create imageArticles";
    }

    @RequestMapping(value = "/imageArticles/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imageArticles " + id;
    }

    @RequestMapping(value = "/imageArticles/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imageArticles " + id;
    }
}
