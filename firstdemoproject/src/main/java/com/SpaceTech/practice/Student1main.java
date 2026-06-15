package com.SpaceTech.practice;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpaceTech.FirstdemoprojectApplication;

public class Student1main {
	/*
	 * public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(FirstdemoprojectApplication.class, args);
		Student1Service ssi = (Student1Service) context.getBean(Student1Service.class);
		
		
		
		
		 Student1 s1 = new Student1("ankit raj ", "ankit91ece@gmalil.com", 213434);
		 ssi.saveStudnt(s1);
		 
		 List<Student1> s2 = Arrays.asList(new Student1("ram ", "ram@gmail.com", 34221),
				 new Student1("mam ", "mam@gmail.com", 342),
				 new Student1("kam ", "kam@gmail.com", 342233),
				 new Student1("pam ", "pam@gmail.com", 34221),
				 new Student1("raam ", "raam@gmail.com", 34221)
				 );
		 ssi.saveStudents(s2);
		 System.out.println(ssi.CountStudent());
		 System.out.println("the task  is completed");
		/*
		ssi.deleteStudent(1);
		Optional<Student1> opt=ssi.findByStudentId(2);
		
		if(opt.isPresent()) {
			Student1 student = opt.get();
			System.out.println("name of "+student.getName()+ " Email " +student.getEmail()+ " phone Numbber is "+student.getPhoneNumber());
		}
		else {
			System.out.println("invalid");
		}
		
	}
	 
*/
}
