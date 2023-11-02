package org.freshreview.dao;

import java.util.List;

import org.freshreview.entity.Book;
import org.freshreview.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
		
		@Autowired
		private BookRepository repository;
		
		public Book createBook(Book book) {
			return repository.save(book);	
		}
		
		public List<Book> getAllBooks(){
			return repository.findAll();
		}
		
	
}
