package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSentinelController {

    @GetMapping("/HelloSentinel")
    public String helloSentinel() {
        return "Hello Sentinel";
    }
}
