package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book1;
import com.example.demo.entity.Student2;
import com.example.demo.repository.Book1Repository;
import com.example.demo.repository.Student1Repository;

@Service
public class Student2Service {
	@Autowired

	private Student1Repository studentRepo;
	public void StudentData(Student2 stu) {
		studentRepo.save(stu);
	}

}
