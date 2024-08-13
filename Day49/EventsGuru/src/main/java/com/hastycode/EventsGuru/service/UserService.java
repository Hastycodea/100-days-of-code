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

    public User getUserById(int id) {
        return repo.findById(id).orElse(null);
    }

    public User addUser(User user) {
        return repo.save(user);
    }

    public void deleteUser(int id) {
        repo.deleteById(id);
    }

    public User updateUser(int id, User user) {
        return repo.save(user);
    }
}
