package com.SpaceTech.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//
//@Entity
public class Employee {
	//@Id
	private int eid;
	private String eName;
	private String eAddres;
	
	private int eSallery;

	public Employee(int eid, String eName, String eAddres, int eSallery) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eAddres = eAddres;
		this.eSallery = eSallery;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddres() {
		return eAddres;
	}

	public void seteAddres(String eAddres) {
		this.eAddres = eAddres;
	}

	public int geteSallery() {
		return eSallery;
	}

	public void seteSallery(int eSallery) {
		this.eSallery = eSallery;
	}
	
}
