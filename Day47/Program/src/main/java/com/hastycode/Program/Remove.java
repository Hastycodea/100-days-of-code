package com.hastycode.Program;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Remove implements Actions {

    @Override
    public void registered() {
        System.out.println("Not registered");
    }

}
