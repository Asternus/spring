package com.project.spring.task4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppMusicT4.xml");
        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
