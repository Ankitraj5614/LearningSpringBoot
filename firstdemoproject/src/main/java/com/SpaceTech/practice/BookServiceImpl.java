//package com.SpaceTech.serviceimpl;
package com.SpaceTech.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class BookServiceImpl implements BookService {
	//@Autowired
	private BookRepo repo;
	
	//@Override
	public Book saveBook(Book book) {
		Book savedData =repo.save(book);
		return savedData;
	}

	//@Override
	public List<Book> findAllBooks() {
		List<Book> br = (List<Book>) repo.findAll();
		return br;
	}
}
