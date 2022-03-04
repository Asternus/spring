package com.project.spring.task6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppMusicT6.xml");
        ClassicalMusic classicalMusic = context.getBean("MusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}