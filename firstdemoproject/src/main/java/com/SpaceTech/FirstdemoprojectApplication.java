package com.SpaceTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.SpaceTech.practice.Tech;
import com.SpaceTech.practice.myApplication;

@SpringBootApplication

public class FirstdemoprojectApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(FirstdemoprojectApplication.class, args);
		 Tech  t = (Tech)context.getBean("tech");
		 t.teach();
		
		 
	}

}
