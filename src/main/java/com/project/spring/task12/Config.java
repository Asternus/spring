package com.project.spring.task12;

import com.project.spring.task5.ClassicalMusic;
import com.project.spring.task5.Music;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Music getMusic() {
        return new ClassicalMusic();
    }

}
