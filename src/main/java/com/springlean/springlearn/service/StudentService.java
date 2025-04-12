package com.springlean.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springlean.springlearn.Interface.StudentInterface;
import com.springlean.springlearn.enums.StudentGradEnum;
import com.springlean.springlearn.exception.StudentNotFoundException;
import com.springlean.springlearn.model.Student;

@Service
public class StudentService implements StudentInterface {

    @Override
    public List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "sai", StudentGradEnum.ELEVEN));
        students.add(new Student(2, "Rakesk", StudentGradEnum.TEN));
        students.add(new Student(3, "Ramesh", StudentGradEnum.ELEVEN));
        students.add(new Student(4, "kumar", StudentGradEnum.TEN));

        return students;
    }

    public Student getStudentById(int id) {
        return getAllStudents()
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student with ID " + id + " not found"));

    }

}
