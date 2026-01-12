package com.soa.tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/hello")
    public ResponseEntity<String> secureHello() {
        return ResponseEntity.ok("hello, if you see are seeing this message, the jwt token is valid:)");
    }
}
