package org.freshreview.controller;

import java.util.List;

import org.freshreview.entity.Book;
import org.freshreview.entity.ResponseStructure;
import org.freshreview.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping("/books")
	public ResponseEntity<ResponseStructure<Book>> createBooks(@RequestBody Book book) {
		return service.createBook(book);
	}
	
	@GetMapping("/books")
	public ResponseEntity<ResponseStructure<List<Book>>> getAllBooks(){
		return service.getAllBooks();
	}
	
}
