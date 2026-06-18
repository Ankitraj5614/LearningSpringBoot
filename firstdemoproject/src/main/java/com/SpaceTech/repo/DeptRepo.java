package com.SpaceTech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpaceTech.entities.Department;

public interface DeptRepo extends JpaRepository<Department, Integer> {

}
