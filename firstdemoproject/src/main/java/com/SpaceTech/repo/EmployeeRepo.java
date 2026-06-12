package com.SpaceTech.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpaceTech.entities.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
