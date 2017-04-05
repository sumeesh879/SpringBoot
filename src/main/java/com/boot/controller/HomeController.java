package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sumeesh on 03/04/17.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Das Boot, Reporting for Duty!";
    }
}
