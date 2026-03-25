package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                      
@NoArgsConstructor         
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int employeeId;
	String name;
	String email;
	long phone;
	int age;
	String gender;
	String department;
	String designation;
	double salary;
	String joiningDate;

	public Employee(String name, String email, long phone, int age, String gender, String department,
			String designation, double salary, String joiningDate) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

}
