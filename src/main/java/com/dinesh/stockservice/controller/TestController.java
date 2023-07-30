package com.dinesh.stockservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/EBS")
    public String home() {
        return "Welcome to AWS deployement on Bean stalk...";
    }
}
