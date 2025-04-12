package com.springlean.springlearn.Interface;

import java.util.List;

import com.springlean.springlearn.model.Student;

public interface StudentInterface {
    List<Student> getAllStudents();

    Student getStudentById(int id);
}
