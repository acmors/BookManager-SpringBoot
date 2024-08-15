package com.bookManager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bookManager.entity.Book;
import com.bookManager.repository.BookRepository;

@Service
public class BookService {
	
	
	private BookRepository bookRepository;
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	

	public Book save(Book book) {
		bookRepository.save(book);
		return list();
	}
	
	public List<Book> list(){
		Sort sort = Sort.by("genre").descending().and(Sort.by("author").ascending());
		return bookRepository.findAll(sort);
	}
	
	public Optional<Book> getBootById(Long id){
		
	}
	
	public List<Book> getBookByAuthor(String author){
		
	}
	
	public List<Book> getBookByGenre(String genre){
		
	}
	
	public List<Book> getBookByPublicationYear(int publicationYear){
		
	}
	
	public Optional<Book> update(Long id, Book bookDetails){
		
	}
	
	public boolean delete(Long id) {
		
	}
	
	
	
}
