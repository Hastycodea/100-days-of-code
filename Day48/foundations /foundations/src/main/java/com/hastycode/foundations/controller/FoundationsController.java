package com.hastycode.foundations.controller;

import com.hastycode.foundations.model.User;
import com.hastycode.foundations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoundationsController {

    UserService service;

    @Autowired
    public FoundationsController() {
        service = new UserService();
    }

    @RequestMapping("/")
    public String home() {
        return "Foundation legacy";
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User user = service.getUserById(id);
        if (user != null)
            return new ResponseEntity<>(user, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<>(service.addUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<String> updateUser(@PathVariable int id, @RequestBody User user) {
        User newUser = service.updateUser(id, user);
        if (newUser != null) {
            return new ResponseEntity<>("Updated Successfully", HttpStatus.OK);
        } else
            return new ResponseEntity<>("Not Updated", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        User user = service.getUserById(id);
        if (user != null) {
            service.deleteUser(id);
            return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
        } else
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
    }
}
