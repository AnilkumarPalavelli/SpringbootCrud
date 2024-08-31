package com.example.cruddemo.demo.service;

import com.example.cruddemo.demo.models.StudentEntity;
import com.example.cruddemo.demo.repository.StudentRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository1 studentRepository;
    public ResponseEntity<StudentEntity> saveStudent(StudentEntity studentEntity){
      StudentEntity student=  studentRepository.save(studentEntity);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
}
