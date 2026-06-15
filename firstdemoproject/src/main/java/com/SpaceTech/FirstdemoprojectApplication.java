package com.SpaceTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpaceTech.entities.ProductQbe;
import com.SpaceTech.service.prodService;



@SpringBootApplication

public class FirstdemoprojectApplication {
 
	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(FirstdemoprojectApplication.class, args);
		 prodService ps =(prodService) context.getBean(prodService.class);
		
		 ProductQbe pqbe = new ProductQbe();
		 
		 pqbe.setBrand("Apple");
		 ps.getProduct(pqbe);
		 
		 System.out.println("the task is completed");
		 // ps.saveProductQbe();
	}

}
