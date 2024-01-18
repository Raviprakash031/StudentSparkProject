package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student2;
import com.example.demo.repository.Student1Repository;
import com.example.demo.service.Student2Service;

@RestController
@RequestMapping("/student")
public class Student2Controller {
	@Autowired
	private Student1Repository studentRepo;
	
	@Autowired
	private Student2Service studentService;
	@PostMapping("/insertData")
	public void insertStudent(@RequestBody Student2 stu) {
		studentRepo.save(stu);
	}
	
	@GetMapping("/getAllData")
	public List<Student2> getStudent(Student2 stu) {
		
		List<Student2> stu1=studentRepo.findAll();
		return stu1;
	}

}
