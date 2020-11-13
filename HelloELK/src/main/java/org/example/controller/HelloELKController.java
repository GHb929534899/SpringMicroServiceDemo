package org.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloELKController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/HelloELK")
    public String helloELK() {
        //logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"\tInfo log test.");
        logger.debug("Debug log");
        /*logger.error("Sorry, this is a test. No error on here.");
        logger.warn("Sorry, this is a test. No warn on here.");*/
        return "Hello ELK";
    }
}
