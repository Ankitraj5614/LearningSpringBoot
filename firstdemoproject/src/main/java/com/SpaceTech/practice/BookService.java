package com.SpaceTech.practice;
//package com.SpaceTech.service;



import java.util.List;

public interface BookService {
	Book saveBook(Book book);
	List<Book> findAllBooks();
}
