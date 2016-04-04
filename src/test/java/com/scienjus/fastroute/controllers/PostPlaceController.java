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
public class PostPlaceController {

    @RequestMapping(value = "/postPlace", method = GET)
    public String list() {
        return "postPlace list";
    }

    @RequestMapping(value = "/postPlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "postPlace detail " + id;
    }

    @RequestMapping(value = "/postPlace", method = POST)
    public String create() {
        return "create postPlace";
    }

    @RequestMapping(value = "/postPlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify postPlace " + id;
    }

    @RequestMapping(value = "/postPlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete postPlace " + id;
    }
}
