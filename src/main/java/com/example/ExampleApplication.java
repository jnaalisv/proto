package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ExampleApplication {
    private static final Logger logger = LoggerFactory.getLogger(ExampleApplication.class);

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        logger.info("'/hello' requested");
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}