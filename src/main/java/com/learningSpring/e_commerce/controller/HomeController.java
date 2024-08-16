package com.learningSpring.e_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index() {
        return "/html/index.html";
    }

    @GetMapping("/login")
    public String login() {
        return "/html/login.html";
    }

    @GetMapping("/register")
    public String register() {
        return "/html/register.html";
    }
}
