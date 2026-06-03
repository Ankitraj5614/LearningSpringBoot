package com.SpaceTech.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpaceTech.entities.Book;
import com.SpaceTech.repo.BookRepo;
import com.SpaceTech.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo repo;
	
	@Override
	public Book saveBook(Book book) {
		Book savedData =repo.save(book);
		return savedData;
	}

	@Override
	public List<Book> findAllBooks() {
		List<Book> br = (List<Book>) repo.findAll();
		return br;
	}
}
