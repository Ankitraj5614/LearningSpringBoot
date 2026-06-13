package com.SpaceTech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpaceTech.entities.Myuser;

@Repository
public interface MyuserRepo extends JpaRepository <Myuser, Integer> {

}
