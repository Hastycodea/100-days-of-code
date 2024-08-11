package org.hastycode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Dev obj = (Dev) context.getBean("dev"); // getting bean by name

        Dev obj =  context.getBean(Dev.class); // getting bean by type

        obj.getCom().compile();

    }
}
