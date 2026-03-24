package com.tka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.EmployeeRepository;
import com.tka.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	public String insertData(Employee e) {
		repo.save(e);
		return "Data is Inserted... !";
	}

	public String updateData(Employee e, int id) {
		Employee e1 = repo.getById(id);
		e1.setName(e.getName());
		e1.setEmail(e.getEmail());
		e1.setPhone(e.getPhone());
		e1.setAge(e.getAge());
		e1.setGender(e.getGender());

		return "Data is Updated... !";
	}

	public List<Employee> getAllData() {
		return repo.findAll();
	}

	public Optional<Employee> getSingleData(int id) {
		return repo.findById(id);
	}

	public String deleteData(int id) {
		repo.deleteById(id);
		return "Data is Inserted... !";
	}
}
