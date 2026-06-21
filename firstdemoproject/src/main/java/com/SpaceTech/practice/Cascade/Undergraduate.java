package com.SpaceTech.practice.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Undergraduate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name; 
	private String Course;
	@OneToOne(cascade = CascadeType.ALL)
	private IdCard idcard;
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
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public IdCard getIdcard() {
		return idcard;
	}
	public void setIdcard(IdCard idcard) {
		this.idcard = idcard;
	}
	public Undergraduate(String name, String course, IdCard idcard) {
		super();
		this.name = name;
		Course = course;
		this.idcard = idcard;
	}
	public Undergraduate() {
		super();
	}
	
	
}
