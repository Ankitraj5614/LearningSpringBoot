package com.SpaceTech.practice;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MyuserServiceImpl implements Myuserservice {

//	@Autowired
	MyuserRepo repo;

	@Override
	public void saveUser() {
		List<Myuser> asList = Arrays.asList(new Myuser("Ariy", "ariy@gmail.com", "abac", "923134123"),
				new Myuser("ray", "ray@gmail.com", "huvabac", "5192313423"),
				new Myuser("roy", "roy@gmail.com", "ahuvbac", "4129231343"),
				new Myuser("rohit", "rohit@gmail.com", "abhuvac", "3123923134"),
				new Myuser("nikhil", "nikhil@gmail.com", "abahuvc", "832343123"),
				new Myuser("monu", "monu@gmail.com", "abachuv", "93183234323"),
				new Myuser("sonu", "sonu@gmail.com", "ahuvbac", "7128323433"),
				new Myuser("punkaj", "punkaj@gmail.com", "xdabsaac", "4123832343"),
				new Myuser("ankit", "ankit@gmail.com", "huvm", "63128323433"));
	//	repo.saveAll(asList);
		System.out.println("All user is saved");
	}

	@Override
	public List<Myuser> findAllUser() {
		//List<Myuser> all = repo.findAll(Sort.by("phone").ascending().and(Sort.by("uName")));
		//return all;
		return null;
	}

}
