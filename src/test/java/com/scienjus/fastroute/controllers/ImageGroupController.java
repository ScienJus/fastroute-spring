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
public class ImageGroupController {

    @RequestMapping(value = "/imageGroup", method = GET)
    public String list() {
        return "imageGroup list";
    }

    @RequestMapping(value = "/imageGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imageGroup detail " + id;
    }

    @RequestMapping(value = "/imageGroup", method = POST)
    public String create() {
        return "create imageGroup";
    }

    @RequestMapping(value = "/imageGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imageGroup " + id;
    }

    @RequestMapping(value = "/imageGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imageGroup " + id;
    }
}
