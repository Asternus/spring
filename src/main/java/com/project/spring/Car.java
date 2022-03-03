package com.project.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private CarEngine carEngine;

    public void getCarEngine() {
        System.out.println(carEngine.getEngine());
    }
}
