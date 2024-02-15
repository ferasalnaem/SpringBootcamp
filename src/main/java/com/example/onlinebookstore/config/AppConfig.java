package com.example.onlinebookstore.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String welcomeMessage(){return "Welcome to the Online Bookstore"; }

    @PostConstruct
    public void init() {System.out.println("Initializing the Online Bookstore application...");}

    @PreDestroy
    public void cleanup() {System.out.println("Cleaning up resources before shutting down...");}
}
