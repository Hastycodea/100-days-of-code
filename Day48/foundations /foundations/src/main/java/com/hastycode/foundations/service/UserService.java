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

    public void updateProduct(int id) {
        User user;
        user = userHashMap.getOrDefault(id, null);
        userHashMap.values().stream().filter(p -> p.getId() == id)
                .forEach( p -> {
                    p.setName(user.getName());
                    p.setEmail(user.getEmail());
                    p.setAge(user.getAge());
                });
        userHashMap.put(id, user);
    }

    public void deleteUser(int id) {
        userHashMap.remove(id);
    }

}
