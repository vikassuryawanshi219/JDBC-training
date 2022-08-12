package com.bookapp.service;

import java.util.List;

import com.bookapp.model.BookNotFoundException;

public class OrderDetails {
	IBookService bookServices;
	public void setBookService(IBookService bookService) {
		this.bookServices=bookService;
	}
public List<Book> findByAuthor(String author ) throws BookNotFoundException{
	return null;
	
}
public String orderBook(int bookId) {
	return null;
}
public String addBook(Book book)
{
	return null;
}
}
