package com.example.onlinebookstore.controller;

import com.example.onlinebookstore.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final String welcomeMessage;

    @Autowired
    public Controller(AppConfig appConfig){
        this.welcomeMessage = appConfig.welcomeMessage();
    }


    @GetMapping("/")
    public String helloWorld(){
        return welcomeMessage;
    }
}
