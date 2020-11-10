package org.example.cotroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPHPController {

    @Value("${config.message}")
    String configMassage;

    @GetMapping("/HelloPHP")
    public String helloPHPServer() {
        return configMassage;
    }
}
