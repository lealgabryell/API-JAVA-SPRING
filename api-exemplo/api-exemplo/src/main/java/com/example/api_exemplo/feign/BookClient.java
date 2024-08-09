package com.example.api_exemplo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.api_exemplo.domain.Book;

@FeignClient(name = "book-api", url = "https://books-api-leal.s3.us-east-2.amazonaws.com")
public interface BookClient {
	
	@GetMapping("/books.json")
	List<Book> getBooks();
}
