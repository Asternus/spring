package com.project.spring.task7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppMusicT7.xml");
        Music music = context.getBean("someMusic", Music.class);
        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer1 = new MusicPlayer(classicalMusic);
        musicPlayer.playMusic();
        musicPlayer1.playMusic();
    }
}