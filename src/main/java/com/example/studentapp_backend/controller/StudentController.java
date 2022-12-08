package com.example.studentapp_backend.controller;


import com.example.studentapp_backend.dao.StudentDao;
import com.example.studentapp_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class StudentController {


    @Autowired
    StudentDao studentDao;


    @GetMapping("/")
    public String HomePage(){
        return "Welcome to my Website!";
    }

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public Map<String, String> AddStudent(@RequestBody Students s)
    {
        System.out.println(s.getName().toString());
        studentDao.save(s);

        HashMap<String , String > hashMap = new HashMap<>();
        hashMap.put("status","success");
        return hashMap;
    }

}
