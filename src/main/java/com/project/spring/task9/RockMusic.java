package com.project.spring.task9;

import org.springframework.stereotype.Component;

@Component("someMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Metallica: Enter Sandman";
    }
}