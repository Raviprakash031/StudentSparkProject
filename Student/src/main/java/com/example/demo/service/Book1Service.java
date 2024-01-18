package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book1;
import com.example.demo.repository.Book1Repository;

@Service
public class Book1Service {
	@Autowired

	private Book1Repository bookRepo;
	public void bookData(Book1 b) {
		bookRepo.save(b);
	}

}
