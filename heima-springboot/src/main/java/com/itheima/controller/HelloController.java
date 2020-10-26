package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    // http://localhost:8080/hello
    @GetMapping("hello")
    public String hello(){
        return "Hello, Spring Boot!";
    }
}
