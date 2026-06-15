package com.SpaceTech.service;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {
	void SaveAllProduct();
	void findBYProductName(String Name);
	void findByProductCategoryName(String Name);
	void findByProductPriceGratherthan1(double p);
}
