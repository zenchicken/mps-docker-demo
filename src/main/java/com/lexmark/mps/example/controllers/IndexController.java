package com.lexmark.mps.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jsh on 6/26/15.
 */
@RestController
@RequestMapping(value = "/example")
public class IndexController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index() {
        return "Welcome to Docker! Hello Lexmark!";
    }
}
