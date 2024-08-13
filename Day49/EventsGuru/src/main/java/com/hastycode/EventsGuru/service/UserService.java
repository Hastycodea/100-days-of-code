package com.hastycode.EventsGuru.service;

import com.hastycode.EventsGuru.model.User;
import com.hastycode.EventsGuru.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepo repo;

    @Autowired
    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
