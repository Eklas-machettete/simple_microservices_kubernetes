package com.example.demo.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "departmentService", url="localhost:8000")
public interface DepartmentServiceProxy {
	
	@GetMapping("department/{name}")
	public  name() {
		
	}

}
