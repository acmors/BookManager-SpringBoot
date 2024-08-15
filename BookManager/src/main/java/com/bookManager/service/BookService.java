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
		return bookRepository.save(book);
	}
	
	public List<Book> list(){
		Sort sort = Sort.by("name").descending().and(Sort.by("author").ascending());
		return bookRepository.findAll(sort);
	}
	
	public Optional<Book> getBootById(Long id){
		return bookRepository.findById(id);
	}
	
	public List<Book> getBookByAuthor(String author){
		return bookRepository.findByAuthor(author);
	}
	
	public List<Book> getBookByGenre(String genre){
		return bookRepository.findByGenre(genre);
	}
	
	public List<Book> getBookByPublicationYear(String publicationYear){
		return bookRepository.findByPublicationYear(publicationYear);
	}
	
	public Optional<Book> update(Long id, Book bookDetails){
		return bookRepository.findById(id).map(bookExistent -> {
			bookExistent.setTitle(bookDetails.getTitle());
			bookExistent.setAuthor(bookDetails.getAuthor());
			bookExistent.setGenre(bookDetails.getGenre());
			bookExistent.setPublicationYear(bookDetails.getPublicationYear());
			return bookRepository.save(bookExistent);
		});
	}
	
	public boolean delete(Long id) {
		return bookRepository.findById(id).map(book -> {
			bookRepository.delete(book);
			return true;
		}).orElse(false);
	}
	
	
	
}
