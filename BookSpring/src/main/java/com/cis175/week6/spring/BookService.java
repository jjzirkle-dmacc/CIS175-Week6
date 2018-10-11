package com.cis175.week6.spring;

public interface BookService {
	
	public Book listBooks();

	public void sellBook(long id);
	
	public void buyBook(long id, String title, double price);

	public void changePrice(long id, double price);

	public Book getBook(long id);


}
