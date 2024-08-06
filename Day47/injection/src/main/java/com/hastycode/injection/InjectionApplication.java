package com.hastycode.injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(InjectionApplication.class, args);

		Lions obj = context.getBean(Lions.class);
		obj.build();
	}


}
