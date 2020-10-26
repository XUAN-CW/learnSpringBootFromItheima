package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    // http://localhost:8080/helloConfig
    @GetMapping("helloConfig")
    public String helloConfig() {
        System.out.println("dataSource = " + dataSource);
        return "Hello, Spring Boot!";
    }

    // http://localhost:8080/hello
    @GetMapping("hello")
    public String hello(){
        return "Hello, Spring Boot!";
    }
}
