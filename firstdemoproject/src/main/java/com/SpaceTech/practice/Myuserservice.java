package com.SpaceTech.practice;

import java.util.List;

import org.springframework.stereotype.Service;

//@Service
public interface Myuserservice {
	void saveUser();
	List<Myuser> findAllUser();
}
