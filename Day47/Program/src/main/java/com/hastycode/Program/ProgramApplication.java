package com.hastycode.Program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProgramApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProgramApplication.class, args);

		Person obj = context.getBean(Person.class);
		obj.build();

	}

}
