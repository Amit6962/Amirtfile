package com.vir.model;

public class Book {

	private int Bookid;
	private String totle,author;
	private int edition;
	private int price;
	private Record record;
	
	public Book(int bookid, String totle, String author, int edition, int price) {
		super();
		Bookid = bookid;
		this.totle = totle;
		this.author = author;
		this.edition = edition;
		this.price = price;
		
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookid() {
		return Bookid;
	}

	public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public String getTotle() {
		return totle;
	}

	public void setTotle(String totle) {
		this.totle = totle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	
	
	
	
	
}
