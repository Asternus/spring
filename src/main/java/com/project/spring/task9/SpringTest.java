package com.project.spring.task9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppMusicT9.xml");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}