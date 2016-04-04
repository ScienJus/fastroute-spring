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
public class ActivePlaceController {

    @RequestMapping(value = "/activePlace", method = GET)
    public String list() {
        return "activePlace list";
    }

    @RequestMapping(value = "/activePlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "activePlace detail " + id;
    }

    @RequestMapping(value = "/activePlace", method = POST)
    public String create() {
        return "create activePlace";
    }

    @RequestMapping(value = "/activePlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify activePlace " + id;
    }

    @RequestMapping(value = "/activePlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete activePlace " + id;
    }
}
