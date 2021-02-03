package com.example.mythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name2", required = false, defaultValue = "World") String name, Model model){
        model.addAttribute("name2", name);
        return "greeting";
    }
}
