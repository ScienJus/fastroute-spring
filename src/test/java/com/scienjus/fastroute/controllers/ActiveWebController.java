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
public class ActiveWebController {

    @RequestMapping(value = "/activeWeb", method = GET)
    public String list() {
        return "activeWeb list";
    }

    @RequestMapping(value = "/activeWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activeWeb detail " + id;
    }

    @RequestMapping(value = "/activeWeb", method = POST)
    public String create() {
        return "create activeWeb";
    }

    @RequestMapping(value = "/activeWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activeWeb " + id;
    }

    @RequestMapping(value = "/activeWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activeWeb " + id;
    }
}
