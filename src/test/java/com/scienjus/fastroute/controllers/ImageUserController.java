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
public class ImageUserController {

    @RequestMapping(value = "/imageUser", method = GET)
    public String list() {
        return "imageUser list";
    }

    @RequestMapping(value = "/imageUser/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "imageUser detail " + id;
    }

    @RequestMapping(value = "/imageUser", method = POST)
    public String create() {
        return "create imageUser";
    }

    @RequestMapping(value = "/imageUser/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify imageUser " + id;
    }

    @RequestMapping(value = "/imageUser/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete imageUser " + id;
    }
}
