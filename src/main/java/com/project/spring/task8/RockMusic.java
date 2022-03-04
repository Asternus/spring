package com.project.spring.task8;

import org.springframework.stereotype.Component;

@Component("someMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Metallica: Enter Sandman";
    }
}