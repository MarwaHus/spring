package com.songr.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class Capitalize {
    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable String text, Model model) {
        String capitalizedText = text.toUpperCase();
        model.addAttribute("text", capitalizedText);
        return "hello";
    }
}
