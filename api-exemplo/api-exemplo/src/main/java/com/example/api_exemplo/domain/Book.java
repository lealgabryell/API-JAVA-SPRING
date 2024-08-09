package com.example.api_exemplo.domain;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {	
	public String title;
	public String author;
	public String programmingArea;
	public String publisher;
	public String imageUrl;
	public Integer publicationYear;
	public String isbn;
}

