package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book1;
@Repository
public interface Book1Repository extends JpaRepository<Book1,Integer>{

	

}
