package com.cts.array;

public class Book {
	private int bookId;
	private String bookName;
	public Book() {
		super();
	}
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public void showBook() {
		System.out.println(bookId+" "+bookName);
	}

}
