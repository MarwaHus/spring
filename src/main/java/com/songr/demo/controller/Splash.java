package com.songr.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Splash {

    @GetMapping("/")
    public String home() {
        return "splash.html";
    }
}
