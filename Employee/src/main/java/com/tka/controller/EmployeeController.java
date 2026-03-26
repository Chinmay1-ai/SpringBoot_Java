package com.tka.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Employee;
import com.tka.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/register")   
	public String insertData(@RequestBody Employee e) {
		return service.insertData(e);
	}

	@DeleteMapping("/remove")    
	public String deleteData(@RequestParam int id) {
		return service.deleteData(id);
	}

	@PutMapping("/edit/{id}")    
	public String updateData(@RequestBody Employee e, @PathVariable int id) {
		return service.updateData(e, id);
	}

	@GetMapping("/search")     
	public List<Employee> getAllData() {
		return service.getAllData();
	}

	@GetMapping("/search/{eId}")  
	public Optional<Employee> getSingleData(@PathVariable int eId) {
		return service.getSingleData(eId);
	}

}
