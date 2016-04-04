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
public class ImagePostController {

    @RequestMapping(value = "/imagePost", method = GET)
    public String list() {
        return "imagePost list";
    }

    @RequestMapping(value = "/imagePost/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imagePost detail " + id;
    }

    @RequestMapping(value = "/imagePost", method = POST)
    public String create() {
        return "create imagePost";
    }

    @RequestMapping(value = "/imagePost/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imagePost " + id;
    }

    @RequestMapping(value = "/imagePost/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imagePost " + id;
    }
}
