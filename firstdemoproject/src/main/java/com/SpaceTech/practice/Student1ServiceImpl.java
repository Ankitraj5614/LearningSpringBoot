package com.SpaceTech.practice;
//pkage com.SpaceTech.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Student1ServiceImpl implements Student1Service {
	@Autowired
	Student1Repo repo;
	
	@Override
	public Student1 saveStudnt(Student1 student1) {
		Student1 s1 = repo.save(student1);
		return s1;
	}

	@Override
	public void saveStudents(List<Student1> s1) {
		 repo.saveAll(s1);
		
		
	}

	@Override
	public Optional<Student1> findByStudentId(int rollNumber) {
		Optional<Student1> optionStuden =  repo.findById(rollNumber);
		return optionStuden;
	}

	@Override
	public void deleteStudent(int rollNumber) {
		repo.deleteById(rollNumber);
		
	}

	@Override
	public long CountStudent() {
		long i = repo.count();
		return i;
	}
	

}
