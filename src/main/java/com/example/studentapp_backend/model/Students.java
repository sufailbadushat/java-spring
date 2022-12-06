package com.example.studentapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Students {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String admNo;
    private int rollNo;
    private String collegeName;

    public Students() {}

    public Students(int id, String name, String admNo, int rollNo, String collegeName) {
        this.id = id;
        this.name = name;
        this.admNo = admNo;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmNo() {
        return admNo;
    }

    public void setAdmNo(String admNo) {
        this.admNo = admNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
