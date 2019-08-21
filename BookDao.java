package com.vir.dao;

import com.vir.model.Book;

public interface BookDao {
	
	Book findById(int bid);
	Book updateBook(Book book);
	Book addBook(Book book);
	Book deleteBook(Book book);
	

}
