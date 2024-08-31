package com.example.cruddemo.demo.repository;

import com.example.cruddemo.demo.models.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository1 extends JpaRepository<StudentEntity,Integer> {
}
