package com.SpaceTech.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpaceTech.entities.Product;
import com.SpaceTech.repo.ProductRepo;
import com.SpaceTech.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo repo;

	@Override
	public void SaveAllProduct() {
		List<Product> products = Arrays.asList(
			    new Product("Samsung", 29999.99, "Electronics"),
			    new Product("Apple", 79999.99, "Electronics"),
			    new Product("Nike", 2499.99, "Footwear"),
			    new Product("Adidas", 2199.99, "Footwear"),
			    new Product("Puma", 1899.99, "Footwear"),
			    new Product("Dell", 55999.99, "Laptop"),
			    new Product("HP", 48999.99, "Laptop"),
			    new Product("Lenovo", 52999.99, "Laptop"),
			    new Product("Sony", 39999.99, "Electronics"),
			    new Product("LG", 34999.99, "Home Appliance"),
			    new Product("Whirlpool", 27999.99, "Home Appliance"),
			    new Product("Godrej", 19999.99, "Furniture"),
			    new Product("Boat", 1499.99, "Accessories"),
			    new Product("JBL", 2999.99, "Accessories"),
			    new Product("Canon", 45999.99, "Camera"),
			    new Product("Nikon", 49999.99, "Camera"),
			    new Product("Zara", 1799.99, "Clothing"),
			    new Product("H&M", 1299.99, "Clothing"),
			    new Product("RayBan", 5999.99, "Accessories"),
			    new Product("Titan", 8999.99, "Watches")
			);
		repo.saveAll(products);
	}

	@Override
	public void findBYProductName(String name) {
		Product pr =  repo.findBybrand(name);
		System.out.println(pr.toString());
	}

	@Override
	public void findByProductCategoryName(String Name) {
		List<Product> product = repo.findBycategory(Name);
		for(Product pr : product) {
			System.out.println(pr.toString());
		}
		
	}

	@Override
	public void findByProductPriceGratherthan1(double p) {
		
		List<Product> product = repo.findBypriceGreaterThan(p);
		for(Product pr : product) {
			System.out.println(pr.toString());
		}
	}
	
	

}
