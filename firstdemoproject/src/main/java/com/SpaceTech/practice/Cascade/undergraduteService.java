package com.SpaceTech.practice.Cascade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class undergraduteService {
	@Autowired
	UndergraduateRepo repo;
	
	public void saveAll() {
		List<Undergraduate> students = List.of(

			    new Undergraduate("Ankit Raj", "Computer Science",
			            new IdCard("IIT Delhi")),

			    new Undergraduate("Rahul Sharma", "Information Technology",
			            new IdCard("NIT Trichy")),

			    new Undergraduate("Priya Singh", "Electronics",
			            new IdCard("DTU")),

			    new Undergraduate("Aman Verma", "Mechanical Engineering",
			            new IdCard("IIT Kanpur")),

			    new Undergraduate("Sneha Gupta", "Civil Engineering",
			            new IdCard("NSUT")),

			    new Undergraduate("Rohit Kumar", "Data Science",
			            new IdCard("IIIT Hyderabad")),

			    new Undergraduate("Neha Yadav", "Artificial Intelligence",
			            new IdCard("IIT Bombay")),

			    new Undergraduate("Vikas Mishra", "Electrical Engineering",
			            new IdCard("BITS Pilani")),

			    new Undergraduate("Pooja Sharma", "Cyber Security",
			            new IdCard("VIT Vellore")),

			    new Undergraduate("Karan Patel", "Software Engineering",
			            new IdCard("Manipal University"))
			);
		repo.saveAll(students);
		
	}
	public void DeleteUndergaute(int id) {
		repo.deleteById(id);
	}
}
