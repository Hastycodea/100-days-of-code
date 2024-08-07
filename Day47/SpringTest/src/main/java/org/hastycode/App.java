package org.hastycode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext();

        Dev obj = context.getBean(Dev.class);
        obj.build();
    }
}
