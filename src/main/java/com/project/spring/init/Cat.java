package com.project.spring.init;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cat {

    @PostConstruct
    public void doInit() {
        System.out.println("Doing my init");
    }

    @PreDestroy
    public void doDestruction() {
        System.out.println("Doing my destruction");
    }

}
