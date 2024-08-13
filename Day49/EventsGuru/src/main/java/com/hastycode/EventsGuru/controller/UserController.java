package com.hastycode.EventsGuru.controller;

import com.hastycode.EventsGuru.model.User;
import com.hastycode.EventsGuru.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String home() {
        return "WelcomeHome";
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }
}
