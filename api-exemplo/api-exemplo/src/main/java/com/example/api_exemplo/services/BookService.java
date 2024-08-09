package com.example.api_exemplo.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.api_exemplo.domain.Book;
import com.example.api_exemplo.feign.BookClient;

@Service
public class BookService {
	
	private final BookClient bookClient;
	
	public BookService(BookClient client) {
		this.bookClient = client;
	};
	
	public List<Book> getBooksFromLibrary(){
		return this.bookClient.getBooks();
	}
}
