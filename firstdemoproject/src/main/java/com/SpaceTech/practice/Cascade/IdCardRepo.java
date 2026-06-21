package com.SpaceTech.practice.Cascade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface IdCardRepo extends JpaRepository<IdCard, Integer>{

}
