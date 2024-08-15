package com.bookManager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String author;
	private String genre;
	private String publicationYear;
	
	public Book() {
		
	}

	public Book(String author, String genre, String publicationYear) {
		this.author = author;
		this.genre = genre;
		this.publicationYear = publicationYear;
	}
	
	
	
}
