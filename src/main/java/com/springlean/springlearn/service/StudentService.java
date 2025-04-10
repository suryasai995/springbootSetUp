package com.springlean.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springlean.springlearn.model.Student;

@Service
public class StudentService {
    
    public List<Student> getAllStudents(){

        List<Student> students= new ArrayList<>();

        students.add(new Student(1,"sai",11));
        students.add(new Student(2,"Rakesk",12));
        students.add(new Student(3,"Ramesh",11));
        students.add(new Student(4,"kumar",10));

        return students;
    }
    
    public Student getStudentById(int id) {
        return getAllStudents()
            .stream()
            .filter(s -> s.getId() == id)
            .findFirst()
            .orElse(null);
    }
    
    
}
