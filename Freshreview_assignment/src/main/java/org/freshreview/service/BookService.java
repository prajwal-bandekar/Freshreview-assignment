package org.freshreview.service;

import java.util.List;


import org.freshreview.dao.BookDao;
import org.freshreview.entity.Book;
import org.freshreview.entity.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookDao dao;
	
	//POST - /books
	public ResponseEntity<ResponseStructure<Book>> createBook(Book book){
		ResponseStructure<Book> structure = new ResponseStructure<>();
		dao.createBook(book);
		structure.setData(book);
		structure.setMessage("Book Created Succesfully");
		structure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Book>>(structure, HttpStatus.CREATED);
	}
	
	//GET - /books
	public ResponseEntity<ResponseStructure<List<Book>>> getAllBooks(){
	    ResponseStructure<List<Book>> structure = new ResponseStructure<>();
	    List<Book> books = dao.getAllBooks();
	    structure.setData(books);
	    structure.setMessage("Books found in record");
	    structure.setStatusCode(HttpStatus.ACCEPTED.value());
	    
	    return new ResponseEntity<ResponseStructure<List<Book>>>(structure, HttpStatus.ACCEPTED);
	}
}
