package com.githubactions.main.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/works")
    public String isItDeployed() {
        return "It works fine!";
    }
}
