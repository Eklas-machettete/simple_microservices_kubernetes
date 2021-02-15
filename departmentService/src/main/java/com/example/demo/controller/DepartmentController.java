package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Department;
import com.example.demo.repository.DepartmentRepository;

@RestController
public class DepartmentController {
	DepartmentRepository repository;
	@Autowired
	@PostMapping("department/add")
	public DepartmentController(DepartmentRepository repository)
	{
	 this.repository=repository;	
	}
	
	@GetMapping("department/{name}")
	public Department getDepartmentByDepartmentName(@PathVariable(name = "name") String name) 
	{
		return repository.findByName(name);
	}

}
