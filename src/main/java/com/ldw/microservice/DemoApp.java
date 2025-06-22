package com.ldw.microservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApp {
    @Value("${message:Hello}")
    private String msg;

    @GetMapping("/message")
    public String message() { return msg; }

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }
}