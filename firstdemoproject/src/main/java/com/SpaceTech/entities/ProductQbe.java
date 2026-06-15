package com.SpaceTech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * This is a Example of Query base example
 **		Rule must Follow;
 *			1)	Not Use primitive type datatype Always use Non Primitive data Type;
 *			2)	first create Example interface 
 *			3)	Repo.findAll();
 */
@Entity
public class ProductQbe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String brand;
	private String cat;
	private String pdesc;
	
	private Double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductQbe(String name, String brand, String cat, String pdesc, Double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.cat = cat;
		this.pdesc = pdesc;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductQbe [id=" + id + ", name=" + name + ", brand=" + brand + ", cat=" + cat + ", pdesc=" + pdesc
				+ ", price=" + price + "]";
	}

	public ProductQbe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
