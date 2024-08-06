package com.hastycode.Program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Qualifier("register")
    @Autowired //field injection
    private Actions actions;

//    // Constructor injection
//    public User (Register register) {
//        this.register = register;
//    }
    public void build() {
        System.out.println("Building a person");
        actions.registered();
    }
}
