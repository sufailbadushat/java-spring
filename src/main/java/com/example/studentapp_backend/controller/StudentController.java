package com.example.studentapp_backend.controller;


import com.example.studentapp_backend.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to my Website!";
    }

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddStudent(@RequestBody Students s)
    {
        System.out.println(s.getName().toString());
        return "Student added successfully!";
    }

}
