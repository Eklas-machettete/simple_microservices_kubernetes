package com.example.demo.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
	Long id;
	String name;
	String department;
	public Student(Long id, String name, String department) {
		this.id=id;
		this.name=name;
		this.department=department;
		
	}
	
	
	

}
