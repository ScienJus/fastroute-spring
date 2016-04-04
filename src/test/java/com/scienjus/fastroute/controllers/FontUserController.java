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
public class FontUserController {

    @RequestMapping(value = "/fontUser", method = GET)
    public String list() {
        return "fontUser list";
    }

    @RequestMapping(value = "/fontUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontUser detail " + id;
    }

    @RequestMapping(value = "/fontUser", method = POST)
    public String create() {
        return "create fontUser";
    }

    @RequestMapping(value = "/fontUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontUser " + id;
    }

    @RequestMapping(value = "/fontUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontUser " + id;
    }
}
