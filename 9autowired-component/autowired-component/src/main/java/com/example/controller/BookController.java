package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.component.Student;
import com.example.entity.Book;
import com.example.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	@Autowired
	private Student studentComponent;
	@GetMapping("/books")
	public List<Book> getBooks() {
		
		return this.bookService.getAllBooks();
	}
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		return this.bookService.getBookById(id);
	}
	@GetMapping("/students")
	public Student getStudent() {
		studentComponent.setStudentCity("karachi");
		studentComponent.setStudentId(0);
		studentComponent.setStudentName("Muhammad Umar Tariq");
		studentComponent.getStudentUniversity().setUniversityName("Bahria University Karachi Campus");
		return studentComponent;
	}
	
}