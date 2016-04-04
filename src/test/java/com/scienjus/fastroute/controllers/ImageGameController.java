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
public class ImageGameController {

    @RequestMapping(value = "/imageGame", method = GET)
    public String list() {
        return "imageGame list";
    }

    @RequestMapping(value = "/imageGame/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imageGame detail " + id;
    }

    @RequestMapping(value = "/imageGame", method = POST)
    public String create() {
        return "create imageGame";
    }

    @RequestMapping(value = "/imageGame/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imageGame " + id;
    }

    @RequestMapping(value = "/imageGame/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imageGame " + id;
    }
}
