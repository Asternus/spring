package com.project.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Scope("singleton")
    @Bean
    public Animal userRepository() {
        return new Dog();
    }

}
