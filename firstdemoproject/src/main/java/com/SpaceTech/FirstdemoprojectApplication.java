package com.SpaceTech;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.SpaceTech.practice.Book;
import com.SpaceTech.practice.BookService;
import com.SpaceTech.practice.Tech;
import com.SpaceTech.practice.myApplication;

@SpringBootApplication

public class FirstdemoprojectApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(FirstdemoprojectApplication.class, args);
		 BookService bs =(BookService) context.getBean(BookService.class);
		 
		 Book book = new Book(3, "Spacex3","Nikhil");
		 
		 bs.saveBook(book);
		 List<Book> bt=bs.findAllBooks();
		bt.forEach(b->System.out.println(b.getAutheor() + " name of book " + b.getTital()+" number of book " +b.getId()));
		 
	}

}
