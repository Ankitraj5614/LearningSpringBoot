package com.SpaceTech.practice;
//package com.SpaceTech.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student1Repo extends CrudRepository<Student1, Integer>{

}
