package com.cis175.week6.spring;

import java.util.List;

public interface BookDao {
	
	public void insert(Book book);
	public void update(Book book);
	public void update(List<Book> books);
	public void delete(long bookId);
	public Book find(long bookId);
	public List<Book> find(List<Long> bookIds);
	public List<Book> find(String title);
	public List<Book> show();

}