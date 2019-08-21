package com.vir.service;

import com.vir.dao.BookDao;
import com.vir.dao.BookDaoImp;
import com.vir.model.Book;

public class BookServiceImp implements BookService {
	
	private BookDao bookdao=new BookDaoImp();

	@Override
	public Book findById(int bid) {
		// TODO Auto-generated method stub
		return bookdao.findById(bid);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookdao.updateBook(book);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookdao.addBook(book);
	}

	@Override
	public Book deleteBook(Book book) {
		// TODO Auto-generated method stub
		return bookdao.deleteBook(book);
	}

	@Override
	public void addBookOfSameType(Book book, int number) {
		// TODO Auto-generated method stub
		for(int i=1;i<number;i++)
		{
			bookdao.addBook(book);
		}
		
	}

}
