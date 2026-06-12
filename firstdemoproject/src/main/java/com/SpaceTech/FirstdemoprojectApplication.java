package com.SpaceTech;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.SpaceTech.entities.Employee;
import com.SpaceTech.service.EmployeeService;



@SpringBootApplication

public class FirstdemoprojectApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(FirstdemoprojectApplication.class, args);
		 EmployeeService bs =(EmployeeService) context.getBean(EmployeeService.class);
		 
		 Employee emp = new Employee(12, "ankit", "R. k sahana road koderma ", 23432);
		 Employee er= bs.saveData(emp);
		 System.out.println(er.getEid());
	}

}
