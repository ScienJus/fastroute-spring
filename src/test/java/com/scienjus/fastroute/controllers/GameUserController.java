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
public class GameUserController {

    @RequestMapping(value = "/gameUser", method = GET)
    public String list() {
        return "gameUser list";
    }

    @RequestMapping(value = "/gameUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "gameUser detail " + id;
    }

    @RequestMapping(value = "/gameUser", method = POST)
    public String create() {
        return "create gameUser";
    }

    @RequestMapping(value = "/gameUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify gameUser " + id;
    }

    @RequestMapping(value = "/gameUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete gameUser " + id;
    }
}
