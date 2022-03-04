package com.project.spring.task8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppMusicT8.xml");
        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}