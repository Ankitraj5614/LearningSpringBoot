package com.SpaceTech.practice.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
//@Entity
//@Table(name = "studentManytoMany")
public class Student {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int RollNum;
	private String name;
	//@ManyToMany
	private List<Course> course;
	public int getRollNum() {
		return RollNum;
	}
	public void setRollNum(int rollNum) {
		RollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
}
