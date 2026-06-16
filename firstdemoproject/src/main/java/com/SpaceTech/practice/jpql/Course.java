package com.SpaceTech.practice.jpql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "my_table")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private int id;
	
	@Column(name = "course_title")
	private String title;
	
	@Column(name = "course_trainer")
	private String trainer;
	@Column(name = "course_dur")
	private int duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Course(String title, String trainer, int duration) {
		super();
		this.title = title;
		this.trainer = trainer;
		this.duration = duration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", trainer=" + trainer + ", duration=" + duration + "]";
	}
	
}
