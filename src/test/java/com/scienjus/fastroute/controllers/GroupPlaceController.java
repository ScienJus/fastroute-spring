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
public class GroupPlaceController {

    @RequestMapping(value = "/groupPlace", method = GET)
    public String list() {
        return "groupPlace list";
    }

    @RequestMapping(value = "/groupPlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "groupPlace detail " + id;
    }

    @RequestMapping(value = "/groupPlace", method = POST)
    public String create() {
        return "create groupPlace";
    }

    @RequestMapping(value = "/groupPlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify groupPlace " + id;
    }

    @RequestMapping(value = "/groupPlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete groupPlace " + id;
    }
}
