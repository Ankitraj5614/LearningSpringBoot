package com.SpaceTech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpaceTech.entities.Employee;
import com.SpaceTech.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo repo;
	public Employee saveData(Employee e) {
		Employee emp= repo.save(e);
		return emp;
	}
}
