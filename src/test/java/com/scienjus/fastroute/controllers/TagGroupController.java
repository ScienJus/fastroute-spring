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
public class TagGroupController {

    @RequestMapping(value = "/tagGroup", method = GET)
    public String list() {
        return "tagGroup list";
    }

    @RequestMapping(value = "/tagGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagGroup detail " + id;
    }

    @RequestMapping(value = "/tagGroup", method = POST)
    public String create() {
        return "create tagGroup";
    }

    @RequestMapping(value = "/tagGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagGroup " + id;
    }

    @RequestMapping(value = "/tagGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagGroup " + id;
    }
}
