package com.SpaceTech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private int id;
	private String tital;
	private String autheor;
	public Book(int id, String tital, String autheor) {
		super();
		this.id = id;
		this.tital = tital;
		this.autheor = autheor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTital() {
		return tital;
	}
	public void setTital(String tital) {
		this.tital = tital;
	}
	public String getAutheor() {
		return autheor;
	}
	public void setAutheor(String autheor) {
		this.autheor = autheor;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
