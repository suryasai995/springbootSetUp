package com.springlean.springlearn.model;

public class Student {
    private int id;
    private String name;
    private int grade;
   public Student(int i, String string, int j) {
        //TODO Auto-generated constructor stub
        this.id =i;
        this.name =string;
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
   public int getGrade() {
    return grade;
   }
   public void setGrade(int grade) {
    this.grade = grade;
   }
}
