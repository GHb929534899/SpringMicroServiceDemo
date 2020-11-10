package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloGetwayMain {
    public static void main(String[] args) {
        SpringApplication.run(HelloGetwayMain.class,args);
    }
}
