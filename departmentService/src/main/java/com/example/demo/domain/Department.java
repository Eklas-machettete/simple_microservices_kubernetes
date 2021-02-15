package com.example.demo.domain;

import lombok.Data;

@Data
public class Department {
	Long id;
	String name;
	String details;
	public Department(Long id, String name, String details) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
	}
	

}