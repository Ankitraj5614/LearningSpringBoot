package com.SpaceTech.practice.jpql;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
	
	@Query("select c from Course c where c.title=:mytitle")
	Course getCouse(String mytitle);
	@Query("from Course c Limit 5")
	List<Course> getTopList();
	/*
	 * 
	@Query("from Course c  ORDER BY C.ID Limit 5")
	List<Course> getLastCourse();
	 */
	
	@Query(value = "Select * from my_table where course_trainer=:trainer", nativeQuery = true)
	List<Course> searchCourseByTrainer(String trainer);
}
