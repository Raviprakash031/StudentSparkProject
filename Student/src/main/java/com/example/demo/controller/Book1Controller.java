package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book1;
import com.example.demo.entity.Student2;
import com.example.demo.repository.Book1Repository;
import com.example.demo.service.Book1Service;

@RestController
@RequestMapping("/book")
public class Book1Controller {
	@Autowired
	private Book1Repository  bookRepo;
	
	@Autowired
	private Book1Service bookservice;
	
	@PostMapping("/insertdata")
	public void bookRepository(@RequestBody Book1 b) {
		bookRepo.save(b);
		
	}
	@PostMapping("/insertdata1")
	public void saveBook(Book1 b) {
		bookservice.bookData(b);
		
	}
	
	@GetMapping("/getAllData")
	public List<Book1> getBook(Book1 b) {
		List<Book1> b1=bookRepo.findAll();
		return b1;
	}
	

}
