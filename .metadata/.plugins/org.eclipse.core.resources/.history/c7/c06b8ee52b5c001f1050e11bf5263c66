package com.bookManager.Controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookManager.entity.Book;
import com.bookManager.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	private BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		Book newBook = bookService.save(book);
		return new ResponseEntity<>(newBook, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> listBooks(){ 
		List<Book> books = bookService.list();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	
}
