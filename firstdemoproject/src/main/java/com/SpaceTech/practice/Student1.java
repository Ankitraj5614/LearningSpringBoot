//package com.SpaceTech.entities;
package com.SpaceTech.practice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student1 {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO) --> It is use for Oracal 
	@GeneratedValue(strategy = GenerationType.IDENTITY)/* It is use for mySql for auto generation primray key */	
	@Column(name = "id")
	private int rollNumber;
	
	@Column(name = "StudentName")
	private String name;

	@Column(name = "email")
	private String Email;
	@Column(name = "pNumber")
	private int phoneNumber;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(String name, String email, int phoneNumber) {
		super();
		this.name = name;

		Email = email;
		this.phoneNumber = phoneNumber;
	}

}
