package com.SpaceTech.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpaceTech.entities.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer> {

}
