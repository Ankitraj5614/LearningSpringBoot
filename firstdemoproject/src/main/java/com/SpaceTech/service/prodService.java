package com.SpaceTech.service;

import org.springframework.stereotype.Service;

import com.SpaceTech.entities.ProductQbe;

@Service
public interface prodService {
	
	void saveProductQbe();
	void getProduct(ProductQbe sample);
	
}
