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
public class GamePlaceController {

    @RequestMapping(value = "/gamePlace", method = GET)
    public String list() {
        return "gamePlace list";
    }

    @RequestMapping(value = "/gamePlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gamePlace detail " + id;
    }

    @RequestMapping(value = "/gamePlace", method = POST)
    public String create() {
        return "create gamePlace";
    }

    @RequestMapping(value = "/gamePlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gamePlace " + id;
    }

    @RequestMapping(value = "/gamePlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gamePlace " + id;
    }
}
