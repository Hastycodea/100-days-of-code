package com.hastycode.foundations.model;

import org.springframework.boot.context.properties.bind.DefaultValue;

public class User {
    private String name;
    private String email;
    private int age;
    private int id;

    public User(String name, String email, int age, int id) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
