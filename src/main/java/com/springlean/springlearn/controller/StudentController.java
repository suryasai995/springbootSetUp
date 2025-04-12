package com.springlean.springlearn.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlean.springlearn.ResponseWrapper.ResponseWrapper;
import com.springlean.springlearn.model.Student;
import com.springlean.springlearn.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("students")
    public ResponseEntity<ResponseWrapper<List<Student>>> getMethodName() {
        List<Student> students = studentService.getAllStudents();
        ResponseWrapper<List<Student>> response = new ResponseWrapper<>("Sucsess", students);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<ResponseWrapper<Student>> getStudentById(@PathVariable int id) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(new ResponseWrapper<>("Student not found", null));
        }
        return ResponseEntity.ok(new ResponseWrapper<>("success", student));
    }

}
