package com.cis175.week6.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDaoInMemory implements BookDao {
	
	private Map<Long, Book> booksMap = new HashMap<Long, Book>();
	{
		Book book1 = new Book(1L, "The Martian", 20.00);
		Book book2 = new Book(2L, "IT", 25.00);
		Book book3 = new Book(3L, "Java For Dummies", 49.99);
		Book book4 = new Book(4L, "Intro To Programming Logic", 29.99);
		booksMap.put(book1.getId(), book1);
		booksMap.put(book2.getId(), book2);
		booksMap.put(book3.getId(), book3);
		booksMap.put(book4.getId(), book4);
	}

	public void insert(Book book) {
		// TODO Auto-generated method stub
		booksMap.put(book.getId(), book);

	}

	public void update(Book book) {
		// TODO Auto-generated method stub
		booksMap.put(book.getId(), book);

	}

	public void update(List<Book> books) {
		// TODO Auto-generated method stub
		for (Book book : books) {
			update(book);
		}

	}

	public void delete(long bookId) {
		// TODO Auto-generated method stub
		booksMap.remove(bookId);

	}

	public Book find(long bookId) {
		// TODO Auto-generated method stub
		return booksMap.get(bookId);
	}

	public List<Book> find(List<Long> bookIds) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		for (Long id : bookIds) {
			books.add(booksMap.get(id));
		}
		return books;
	}

	public List<Book> find(String title) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		for (Book book : booksMap.values()) {
			if (title.equals(book.getTitle())) {
				books.add(book);
			}
		}
		return books;
	}

	public List<Book> show() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		for (Book book : booksMap.values()) {
			System.out.println(book.getId() + book.getTitle() + book.getPrice());
		}
		return books;
	}

}
