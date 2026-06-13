package com.SpaceTech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpaceTech.entities.Myuser;

@Service
public interface Myuserservice {
	void saveUser();
	List<Myuser> findAllUser();
}
