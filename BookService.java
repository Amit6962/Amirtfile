package com.vir.service;

import com.vir.model.Book;

public interface BookService {
	
	Book findById(int bid);
	Book updateBook(Book book);
	Book addBook(Book book);
	Book deleteBook(Book book);
	void addBookOfSameType(Book book,int number);

}
