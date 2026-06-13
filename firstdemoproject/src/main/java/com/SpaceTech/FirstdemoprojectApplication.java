package com.SpaceTech;




import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpaceTech.entities.Myuser;
import com.SpaceTech.service.Myuserservice;


@SpringBootApplication

public class FirstdemoprojectApplication {
 
	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(FirstdemoprojectApplication.class, args);
		Myuserservice us = (Myuserservice) context.getBean(Myuserservice.class);
		 
		List<Myuser> list = us.findAllUser();
		
		list.forEach(b->System.out.println(b.getId()+" " +b.getuEmail()+" "+b.getCity()+" "+b.getPhone()+" "));
		//us.saveUser();
		
		
		
		
	}

}
