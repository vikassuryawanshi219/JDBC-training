package com.bookapp.service;

import com.bookapp.model.BookNotFoundException;

public interface IBookService {
	List<Book> getByAuthor(String author) throws BookNotFoundException{
		
	}

}
