package com.hastycode.webApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String start() {
        return "Welcome to the Home Page!";
    }

    @RequestMapping("/about")
    public String about() {
        return "About Home Page!";
    }
}
