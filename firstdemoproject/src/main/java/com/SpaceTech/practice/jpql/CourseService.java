package com.SpaceTech.practice.jpql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepo repo;
	public void saveAllClourse() {
		List<Course> courses = List.of(
			    new Course("Java Programming", "Rahul Sharma", 60),
			    new Course("Spring Boot", "Amit Verma", 45),
			    new Course("React JS", "Priya Singh", 40),
			    new Course("Data Structures", "Neha Gupta", 55),
			    new Course("SQL Database", "Rohit Kumar", 35),
			    new Course("Microservices", "Ankit Mishra", 50),
			    new Course("Docker & Kubernetes", "Vikas Patel", 48),
			    new Course("System Design", "Saurabh Jain", 42),
			    new Course("AWS Cloud", "Pooja Mehta", 38),
			    new Course("JavaScript Fundamentals", "Karan Malhotra", 30)
			);
		repo.saveAll(courses);
	} 
	public void getCourseData(String title) {
		Course cr = repo.getCouse(title);
		System.out.println(cr.getTrainer());
	}
	public void getTopList() {
		List<Course> cr = repo.getTopList();
		
		cr.forEach(c->System.out.println(c.toString()));
	}
}
