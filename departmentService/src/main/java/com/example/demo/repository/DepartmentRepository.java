package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.Department;

public class DepartmentRepository {
	List<Department>departments =new ArrayList<>();
	
	public Department addDepartment(Department department) {
		departments.add(department);
		return department;
		
		
	}
	
	
	public Department findByName(String name)
	{
	     Department dpt=new Department(0L,null,null);
	        for (Department department : departments)
	          {
		         if(department.getName().equals(name))
			        dpt=department;
	          }
	      return dpt;
	}
	

}
