package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class ApplicationConfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
