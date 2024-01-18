package com.example.demo.controller;



import com.example.demo.entity.Student2;
import com.example.demo.service.SparkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final SparkService sparkService;

    @Autowired
    public StudentController(SparkService sparkService) {
        this.sparkService = sparkService;
    }

    @GetMapping("/processData")
    public ResponseEntity<List<Map<String, Object>>> processStudentData() {
        List<Map<String, Object>> processedData = sparkService.processStudentData();
        return ResponseEntity.ok(processedData);
    }
}


