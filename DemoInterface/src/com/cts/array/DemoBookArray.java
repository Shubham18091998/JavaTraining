package com.cts.array;

public class DemoBookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book books[]=new Book[2];
		books[0]=new Book(101,"Java");
		books[1]=new Book(102,"Python");
		for(Book b:books) {
			b.showBook();
		}
	}

}
