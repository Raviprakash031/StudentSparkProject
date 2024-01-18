package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student2;
@Repository
public interface Student1Repository extends JpaRepository<Student2,Integer>{
	

}
