package com.project.spring.task12;

import com.project.spring.task5.Music;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Music music = context.getBean(Music.class);
        System.out.println(music.getSong());
    }

}
