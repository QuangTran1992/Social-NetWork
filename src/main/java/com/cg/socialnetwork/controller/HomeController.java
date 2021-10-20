package com.cg.socialnetwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String getHome() {
        return "index";
    }

    @GetMapping("/profile")
    public String getProfile() {
        return "profile";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
