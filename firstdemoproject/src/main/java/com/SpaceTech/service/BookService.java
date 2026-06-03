package com.SpaceTech.service;



import java.util.List;

import com.SpaceTech.entities.Book;

public interface BookService {
	Book saveBook(Book book);
	List<Book> findAllBooks();
}
