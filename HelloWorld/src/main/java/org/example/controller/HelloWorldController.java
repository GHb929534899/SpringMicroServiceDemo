package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${config.message}")
    String configMassage;

    @GetMapping("/HelloWorld")
    public String helloWorldServer(){
        return configMassage;
    }
}
