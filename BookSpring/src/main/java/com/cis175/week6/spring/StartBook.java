package com.cis175.week6.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartBook {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/cis175/week6/spring/beans.xml");

		//BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);
		BookService bookService = applicationContext.getBean("bookService", BookService.class);
		
		System.out.println("Current book inventory:	");		
			bookService.listBooks();  
		System.out.println("================================================");
		
		System.out.println("Book 4 Title and Cost:	" + bookService.getBook(4).getTitle() + " " + bookService.getBook(4).getPrice());
		System.out.println("================================================");

		System.out.println("Update Book 4 Cost to 19.99: ");
			bookService.changePrice(4, 19.99);
		System.out.println("Book 4 Title and Cost:	" + bookService.getBook(4).getTitle() + " " + bookService.getBook(4).getPrice());
		System.out.println("================================================");

		System.out.println("Sell (delete) Book 4");
			bookService.sellBook(4);System.out.println("Current book inventory:	");		
			bookService.listBooks();  
		System.out.println("================================================");
		
		System.out.println("Buy (insert) Book 5");
			bookService.buyBook(5, "How to fake it thru College", 999.99);
			bookService.listBooks();
		System.out.println("================================================");
		
	}

}
