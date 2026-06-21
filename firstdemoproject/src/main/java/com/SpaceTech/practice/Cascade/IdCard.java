package com.SpaceTech.practice.Cascade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class IdCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	private String CollegeName;
	public IdCard(String collegeName) {
		super();
		CollegeName = collegeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	
}
