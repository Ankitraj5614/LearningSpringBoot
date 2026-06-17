package com.SpaceTech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpaceTech.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
