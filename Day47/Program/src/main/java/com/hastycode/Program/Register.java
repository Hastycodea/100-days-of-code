package com.hastycode.Program;

import org.springframework.stereotype.Component;

@Component
public class Register implements Actions {

    @Override
    public void registered() {
        System.out.println("Registered");
    }
}
