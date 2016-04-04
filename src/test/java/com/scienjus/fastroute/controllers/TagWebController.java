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
public class TagWebController {

    @RequestMapping(value = "/tagWeb", method = GET)
    public String list() {
        return "tagWeb list";
    }

    @RequestMapping(value = "/tagWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagWeb detail " + id;
    }

    @RequestMapping(value = "/tagWeb", method = POST)
    public String create() {
        return "create tagWeb";
    }

    @RequestMapping(value = "/tagWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagWeb " + id;
    }

    @RequestMapping(value = "/tagWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagWeb " + id;
    }
}
