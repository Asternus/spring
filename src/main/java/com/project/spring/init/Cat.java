package com.project.spring.init;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cat {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @PostConstruct
    public void doInit() {
        System.out.println("Doing my init");
    }

    @PreDestroy
    public void doDestruction() {
        System.out.println("Doing my destruction");
    }

}
