package com.anden.learn.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.anden.learn.kubernetes.controller"})
public class App {
    public static void main(String... args) {
        System.out.println("Hi there!");
        SpringApplication.run(App.class, args);
    }
}
