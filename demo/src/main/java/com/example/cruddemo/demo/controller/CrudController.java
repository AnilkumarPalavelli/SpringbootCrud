package com.example.cruddemo.demo.controller;

import com.example.cruddemo.demo.models.StudentEntity;
import com.example.cruddemo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<?> saveStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.saveStudent(studentEntity);
    }

}
