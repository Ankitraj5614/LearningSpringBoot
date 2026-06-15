package com.SpaceTech.practice;
//package com.SpaceTech.service;

import java.util.List;
import java.util.Optional;

public interface Student1Service  {
	 Student1 saveStudnt(Student1 student1);
	 void saveStudents(List<Student1> s1);
	 Optional<Student1> findByStudentId(int rollNumber);
	 void deleteStudent (int rollNumber);
	  long CountStudent();
}
