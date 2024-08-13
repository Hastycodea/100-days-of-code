package com.hastycode.foundations.service;

import com.hastycode.foundations.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserService {
    HashMap<Integer, User> userHashMap;

    public UserService() {
        this.userHashMap = new HashMap<Integer, User>();
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userHashMap.values());
    }

    public User getUserById(int id) {
        if(userHashMap.containsKey(id)) {
            return userHashMap.get(id);
        }
        return null;
    }

    public User addUser(User user) {
        int key = user.getId();
        userHashMap.put(key, user);
        return user;
    }

    public User updateUser(int id, User user) {
        User user1 = userHashMap.get(id);

        if (user1 != null) {
            user1.setName(user.getName());
            user1.setEmail(user.getEmail());
            user1.setAge(user.getAge());
        } else {
            System.out.println("User with " + id + " does not exist");
        }
        return user1;
    }

    public void deleteUser(int id) {
        userHashMap.remove(id);
    }

}
