package com.example.studentapp_backend.controller;


import com.example.studentapp_backend.dao.StudentDao;
import com.example.studentapp_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class StudentController {


    @Autowired
    StudentDao studentDao;


    @GetMapping("/")
    public String HomePage(){
        return "Welcome to my Website!";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public Map<String, String> AddStudent(@RequestBody Students s)
    {
        System.out.println(s.getName().toString());
        studentDao.save(s);

        HashMap<String , String > hashMap = new HashMap<>();
        hashMap.put("status","success");
        return hashMap;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Students> viewStudents(){
        return (List<Students>) studentDao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json", produces = "application/json")
    public List<Students> searchStudent(@RequestBody Students s){
        String admNo=String.valueOf(s.getAdmNo());
        System.out.println(admNo);
        return studentDao.SearchStudents(s.getAdmNo());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json", produces = "application/json")
    public HashMap<String, String>  deleteStudent(@RequestBody Students s){
        String id=String.valueOf(s.getId());
        System.out.println(id);
        studentDao.StudentDelete(s.getId());

        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("status","success");
        return hashMap;
    }

}
