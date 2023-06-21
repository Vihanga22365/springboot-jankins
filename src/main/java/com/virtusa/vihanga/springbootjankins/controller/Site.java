package com.virtusa.vihanga.springbootjankins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Site {

    @GetMapping("/message/{name}")
    public String getMessage(@PathVariable("name") String name) {
        return "Welcome to the Assignment System " + name;
    }

    @GetMapping("welcome")
    public String displayDetails() {
        return "Hi Application";
    }
}
