package com.itheima.controller;

import com.itheima.config.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcProperties prop;

    @Value("${itcast.url}")
    private String itcastUrl;

    @Value("${itheima.url}")
    private String itheimaUrl;

    // http://localhost:8080/helloMultiYml
    @GetMapping("helloMultiYml")
    public String helloMultiYml() {
        return " itcastUrl = " + itcastUrl + "<br>" +" itheimaUrl = " + itheimaUrl;
    }


    // http://localhost:8080/helloYml
    @GetMapping("helloYml")
    public String helloYml() {
        System.out.println("dataSource = " + prop);
        return "Hello, Spring Boot!";
    }

    // http://localhost:8080/helloProp
    @GetMapping("helloProp")
    public String helloProp() {
        System.out.println("dataSource = " + prop);
        return "Hello, Spring Boot!";
    }

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
