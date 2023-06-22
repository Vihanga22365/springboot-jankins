package com.virtusa.vihanga.springbootjankins.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*")
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
