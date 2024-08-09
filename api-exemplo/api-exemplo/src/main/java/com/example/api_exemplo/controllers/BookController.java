package com.example.api_exemplo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_exemplo.domain.Book;
import com.example.api_exemplo.services.BookService;


@RestController
@RequestMapping("/api/books")
public class BookController {
	
	private final BookService service;
	
	public BookController(BookService service) {
		this.service = service;
	}
	
	@GetMapping("")
	public ResponseEntity<List<Book>> getBooks() {
		List<Book> books = this.service.getBooksFromLibrary();
		System.out.println(books);
		return ResponseEntity.ok().body(books);
	}
}
