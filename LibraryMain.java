package com.vir.librarymain;

import com.vir.model.Book;
import com.vir.service.BookService;
import com.vir.service.BookServiceImp;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bookservice=new BookServiceImp();
		Book book101=bookservice.findById(101);
		book101.setPrice(450);
		bookservice.updateBook(book101);
		System.out.println(book101);
		bookservice.deleteBook(book101);
		
		Book book=bookservice.findById(101);
		
		if(book==null)
		{
			System.out.println("delete successful");
		}
		else
		{
			System.out.println("not deleted");
		}

	}

}
