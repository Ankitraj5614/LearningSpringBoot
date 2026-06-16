//package com.SpaceTech.entities;
package com.SpaceTech.practice.TimeStamp;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BlogPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String pContent;
	
	// when record is update then ignore this column 
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime createdOn;
	// when record is inserted then ignore this updated on column
	@Column(insertable = false)
	@UpdateTimestamp
	private LocalDateTime updateOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public BlogPost() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BlogPost [id=" + id + ", title=" + title + ", pContent=" + pContent + ", createdOn=" + createdOn
				+ ", updateOn=" + updateOn + "]";
	}

	public BlogPost(String title, String pContent, LocalDateTime createdOn, LocalDateTime updateOn) {
		super();
		this.title = title;
		this.pContent = pContent;
		this.createdOn = createdOn;
		this.updateOn = updateOn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getpContent() {
		return pContent;
	}

	public void setpContent(String pContent) {
		this.pContent = pContent;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(LocalDateTime updateOn) {
		this.updateOn = updateOn;
	}

	
}
