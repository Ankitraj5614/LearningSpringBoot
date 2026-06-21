package com.SpaceTech.practice.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "CourseManyToMany")
public class Course {
//	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	//@ManyToMany(mappedBy = "course")
	private List<Student> stud;
	
	
}
