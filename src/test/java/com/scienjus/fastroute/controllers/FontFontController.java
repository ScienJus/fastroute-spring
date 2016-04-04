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
public class FontFontController {

    @RequestMapping(value = "/fontFont", method = GET)
    public String list() {
        return "fontFont list";
    }

    @RequestMapping(value = "/fontFont/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "fontFont detail " + id;
    }

    @RequestMapping(value = "/fontFont", method = POST)
    public String create() {
        return "create fontFont";
    }

    @RequestMapping(value = "/fontFont/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify fontFont " + id;
    }

    @RequestMapping(value = "/fontFont/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete fontFont " + id;
    }
}
