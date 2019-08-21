package com.vir.dao;

import java.util.Collections;
import java.util.HashMap;
import com.vir.model.Book;

public class BookDaoImp implements BookDao {
	
	private static HashMap<Integer,Book> bookmap=new HashMap<>();
	
	static
	{
		Book b=new Book(101,"java Programming","H Schildt",6,400);
		bookmap.put(101, b);
		 b=new Book(102,"java servelets","O Reily",4, 500);
		bookmap.put(102, b);
		 b=new Book(103,"C Programming","H Ritche",6,400);
		bookmap.put(103, b);
		 b=new Book(104,"java Hibernate","O Reilly",6,400);
		bookmap.put(104, b);
		 b=new Book(105,"java ProgrammingK","H Schildt",6,400);
		bookmap.put(105, b);
	}

	@Override
	public Book findById(int bid) {
		// TODO Auto-generated method stub
		return bookmap.get(bid);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookmap.put(book.getBookid(), book);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		int maxKey=Collections.max(bookmap.keySet());
		return bookmap.put(maxKey+1, book);
	}

	@Override
	public Book deleteBook(Book book) {
		// TODO Auto-generated method stub
		return bookmap.remove(book.getBookid());
	}

}
