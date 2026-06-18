package com.SpaceTech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Employee1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ename;
	private String eaddress;
	
	@OneToMany
	private Department dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public Employee1(String ename, String eaddress) {
		super();
		this.ename = ename;
		this.eaddress = eaddress;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee1(String ename, String eaddress, Department dept) {
		super();
		this.ename = ename;
		this.eaddress = eaddress;
		this.dept = dept;
	}
	
	
}
