package com.hastycode.foundations.controller;

import com.hastycode.foundations.model.User;
import com.hastycode.foundations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @PutMapping("/user/{id}")
    public void updateUser(@PathVariable int id) {
        service.updateProduct(id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteUser(id);
    }




}
