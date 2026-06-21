package com.SpaceTech.practice.OneToMany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Department, Integer> {

}
