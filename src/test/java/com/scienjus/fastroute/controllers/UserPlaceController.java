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
public class UserPlaceController {

    @RequestMapping(value = "/userPlace", method = GET)
    public String list() {
        return "userPlace list";
    }

    @RequestMapping(value = "/userPlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userPlace detail " + id;
    }

    @RequestMapping(value = "/userPlace", method = POST)
    public String create() {
        return "create userPlace";
    }

    @RequestMapping(value = "/userPlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userPlace " + id;
    }

    @RequestMapping(value = "/userPlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userPlace " + id;
    }
}
