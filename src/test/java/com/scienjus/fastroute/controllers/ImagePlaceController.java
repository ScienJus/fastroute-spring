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
public class ImagePlaceController {

    @RequestMapping(value = "/imagePlace", method = GET)
    public String list() {
        return "imagePlace list";
    }

    @RequestMapping(value = "/imagePlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imagePlace detail " + id;
    }

    @RequestMapping(value = "/imagePlace", method = POST)
    public String create() {
        return "create imagePlace";
    }

    @RequestMapping(value = "/imagePlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imagePlace " + id;
    }

    @RequestMapping(value = "/imagePlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imagePlace " + id;
    }
}
