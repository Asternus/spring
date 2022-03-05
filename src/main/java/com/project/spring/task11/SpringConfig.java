package com.project.spring.task11;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.project.spring.task11")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
