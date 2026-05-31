package com.SpaceTech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ajay")
public class Student {
	@Id
	private int id;
	
	private String sname;
	private String semail;
	private String addr;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Student(int id, String sname, String semail, String addr) {
		super();
		this.id = id;
		this.sname = sname;
		this.semail = semail;
		this.addr = addr;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
