package com.SpaceTech.practice.pagination;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity
public class MyEmployee {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name; 
	private String addres;
	
	private int dob;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public MyEmployee(String name, String addres, int dob) {
		super();
		this.name = name;
		this.addres = addres;
		this.dob = dob;
	}

	public MyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
}
