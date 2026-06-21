package com.SpaceTech.practice.OneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Dname;
	@OneToMany(mappedBy  = "dept")
	private List<Employee1> emp;
	//@JoinColumn(name = "dept_id")// It is use to only one table S
	
	public Department(Integer id, String dname, List<Employee1> emp) {
		super();
		this.id = id;
		this.Dname = dname;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", Dname=" + Dname + ", emp=" + emp + ", getId()=" + getId() + ", getDname()="
				+ getDname() + ", getEmp()=" + getEmp() + "]";
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

	public List<Employee1> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee1> emp) {
		this.emp = emp;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
