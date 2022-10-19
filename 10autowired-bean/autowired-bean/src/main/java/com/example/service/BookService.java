package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.entity.Book;

@Component
public class BookService {

	private static List<Book> listOfBooks = new ArrayList<>();
	static {
		listOfBooks.add(new Book(12,"java complete reference","xyz"));
		listOfBooks.add(new Book(36,"head first java","abc"));
		listOfBooks.add(new Book(47,"thinking in java","def"));
		
	}
	
	public List<Book> getAllBooks(){
		return listOfBooks;
	}
	
	public Book getBookById(int id){
		Book book = listOfBooks.stream().filter(e->
			e.getId()==id).findFirst().get();
		return book;
	}
}
