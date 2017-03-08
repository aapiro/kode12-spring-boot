package com.kode12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        return "Test: " + new Date();
    }

    @GetMapping("/do-test")
    public String doTest(){
        return restTemplate.getForObject("http://client-service/test", String.class);
    }
}
