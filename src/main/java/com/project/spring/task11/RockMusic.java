package com.project.spring.task11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("someMusic")
@Scope("prototype")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Metallica: Enter Sandman";
    }
}