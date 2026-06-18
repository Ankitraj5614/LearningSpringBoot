package com.SpaceTech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Dname;
	@OneToMany
	private Employee1 emp;
	public Department(String dname, Employee1 emp) {
		super();
		Dname = dname;
		this.emp = emp;
	}
	public Employee1 getEmp() {
		return emp;
	}
	public void setEmp(Employee1 emp) {
		this.emp = emp;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", Dname=" + Dname + "]";
	}
	public Department(String dname) {
		super();
		Dname = dname;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
