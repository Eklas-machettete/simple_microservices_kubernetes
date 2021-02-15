package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;

@RestController
public class StudentController {
	StudentRepository repository;
	@Autowired
	public StudentController(StudentRepository repository)
	{
		this.repository=repository;
	}
	
	@GetMapping("/{id}")
	public Student findStudentById(@PathVariable(name = "id") Long id) {
        return repository.findById(id);
		
	}
	@PostMapping("/add")
	public Student addStudent(Student std) {
        return repository.addStudent(std);
		
	}
	

}
