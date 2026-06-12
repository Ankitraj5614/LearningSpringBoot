package com.SpaceTech.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpaceTech.entities.Student1;

@Repository
public interface Student1Repo extends CrudRepository<Student1, Integer>{

}
