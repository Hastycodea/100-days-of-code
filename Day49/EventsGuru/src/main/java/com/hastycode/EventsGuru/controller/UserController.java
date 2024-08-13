package com.hastycode.EventsGuru.controller;

import com.hastycode.EventsGuru.model.User;
import com.hastycode.EventsGuru.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User newUser = service.getUserById(id);

        if (newUser != null) {
            return new ResponseEntity<>(newUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        if (user != null) {
            return new ResponseEntity<>(service.addUser(user), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
        User obtainedUser = null;
        obtainedUser = service.updateUser(id, user);

        if(obtainedUser != null) {
            return new ResponseEntity<>(obtainedUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        User user = service.getUserById(id);

        if (user != null) {
            service.deleteUser(id);
            return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User not found!", HttpStatus.NOT_FOUND);
        }
    }
}
