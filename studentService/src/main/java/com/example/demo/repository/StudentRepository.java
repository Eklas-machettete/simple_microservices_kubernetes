package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Student;

@Component
public class StudentRepository {
	
	List<Student> students= new ArrayList<>();
	public Student addStudent(Student s)
	{   students.add(s);
	  	return s;
	}
	
	
    public Student findById(Long id)
	{
	     Student std=new Student(0L,null,null);
	        for (Student student : students)
	          {
		         if(student.getId()==id)
			        std=student;
	          }
	      return std;
	}
    
    
	public Student findByDepartment(String dpt)
	{
		Student std=new Student(0L,null,null);
	      for (Student student : students)
	       {
	     	 if(student.getDepartment()==dpt)
			 std=student;
	        }
	          return std;
	}
	
	public Student findDepartmentDetails(String departName)
	{
		Student std=new Student(0L,null,null);
	      for (Student student : students)
	       {
	     	 if(student.getDepartment().equals(departName))
			 std=student;
	        }
	          return std;
	}

}
