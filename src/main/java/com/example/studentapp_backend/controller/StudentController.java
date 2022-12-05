package com.example.studentapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to my Website!";
    }

    @GetMapping("contact")
    public String ContactPage(){
        return "Welcome to my Contact page!";
    }

    @GetMapping("gallery")
    public String GalleryPage(){
        return "Welcome to gallery page!";
    }

    @GetMapping("home")
    public String Homepage(){
        return "Welcome to home page!";
    }
}
