package com.springlean.springlearn.model;

import com.springlean.springlearn.enums.StudentGradEnum;

public class Student {
    private int id;
    private String name;
    private StudentGradEnum grade;

    public Student(int i, String string, StudentGradEnum j) {
        // TODO Auto-generated constructor stub
        this.id = i;
        this.name = string;
        this.grade = j;
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

    public StudentGradEnum getGrade() {
        return grade;
    }

    public void setGrade(StudentGradEnum grade) {
        this.grade = grade;
    }
}
