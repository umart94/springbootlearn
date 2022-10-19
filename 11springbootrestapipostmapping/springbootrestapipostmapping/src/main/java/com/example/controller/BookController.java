package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	@GetMapping("/books")
	public List<Book> getBooks() {
		
		return this.bookService.getAllBooks();
	}
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		return this.bookService.getBookById(id);
	}
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		Book book2 = this.bookService.addBook(book);
		return book2;
	}
	
}