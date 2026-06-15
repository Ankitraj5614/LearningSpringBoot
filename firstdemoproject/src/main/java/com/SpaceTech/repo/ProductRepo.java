package com.SpaceTech.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpaceTech.entities.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	Product findBybrand(String name);
	List<Product> findBycategory(String name);
	List<Product> findBypriceGreaterThan(double price);
				  
}
