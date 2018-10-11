package com.cis175.week6.spring;

import java.util.List;

import com.cis175.week6.spring.BookDao;

public class BookServiceImpl implements BookService {
	
	private BookDao bookDao;
	
	public BookDao getBookDao() {
		return bookDao;
	}

	public Book listBooks() {
		// TODO Auto-generated method stub
		bookDao.show();
		return null;
	}
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void sellBook(long id) {
		// TODO Auto-generated method stub
		bookDao.delete(id);
	}

	public void buyBook(long id, String title, double price) {
		// TODO Auto-generated method stub
		Book myBook = new Book(id, title, price);
		bookDao.insert(myBook);
	}
	
	public void changePrice(long id, double price) {
		// TODO Auto-generated method stub
		Book myBook = bookDao.find(id);
		myBook.setPrice(price);
		bookDao.update(myBook);
	}

	public Book getBook(long id) {
		return bookDao.find(id);
	}

}
