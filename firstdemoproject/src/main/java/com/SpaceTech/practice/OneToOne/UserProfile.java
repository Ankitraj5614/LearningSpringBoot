package com.SpaceTech.practice.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userProfileid;
	
	private String email;
	
	private Long phone;
	
	private String bio;
	@OneToOne(mappedBy = "profile")
	private User user;

	public Long getUserProfileid() {
		return userProfileid;
	}

	public void setUserProfileid(Long userProfileid) {
		this.userProfileid = userProfileid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
