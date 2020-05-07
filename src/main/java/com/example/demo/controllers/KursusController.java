package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KursusController {

    @GetMapping("/kursus")
    public String kursus() {
        return "/kursus";
    }
}
