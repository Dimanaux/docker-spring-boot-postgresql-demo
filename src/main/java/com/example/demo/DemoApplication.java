package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
    private final AccountRepository repository;

    @Autowired
    public DemoApplication(AccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public List<Account> welcome() {
        return repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
