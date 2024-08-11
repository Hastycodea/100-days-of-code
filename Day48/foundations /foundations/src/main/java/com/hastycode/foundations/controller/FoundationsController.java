package com.hastycode.foundations.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoundationsController {

    @RequestMapping("/")
    public String home() {
        return "Foundation legacy";
    }


}
