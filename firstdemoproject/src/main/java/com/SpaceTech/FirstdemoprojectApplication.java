package com.SpaceTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpaceTech.entities.Product;
import com.SpaceTech.service.ProductService;




@SpringBootApplication

public class FirstdemoprojectApplication {
 
	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(FirstdemoprojectApplication.class, args);
		ProductService ps= (ProductService) context.getBean(ProductService.class);
//		ps.SaveAllProduct();
		
		ps.findByProductPriceGratherthan1(27999.99);
	//	ps.findByProductCategoryName("Camera");
//		ps.findBYProductName("Lenovo");
		
	}

}
