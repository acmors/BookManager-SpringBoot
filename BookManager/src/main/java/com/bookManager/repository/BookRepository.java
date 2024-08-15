package com.bookManager.repository;

import java.awt.print.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
	List<Book> findByAuthor(String author);
	
	List<Book> findByGenre(String genre);
	
	List<Book> findByPublicationYear(String publicationYear);
}
