package com.mladams.f1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingsController {

    @RequestMapping("/")
    public String index(final Model model) {
        model.addAttribute("message", "Hello");
        return "greetings";
    }
}
