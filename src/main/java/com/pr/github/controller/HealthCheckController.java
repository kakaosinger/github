package com.pr.github.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @RequestMapping("/health-check")
    public String test() {
        return "이상 없음";
    }

    @RequestMapping("/health-check-two-two")
    public String test1() {
        return "이상 없음";
    }
    
}
