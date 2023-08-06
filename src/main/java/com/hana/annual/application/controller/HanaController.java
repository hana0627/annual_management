package com.hana.annual.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HanaController {


    @GetMapping("/")
    public String hello () {
        return "hello";
    }
}
