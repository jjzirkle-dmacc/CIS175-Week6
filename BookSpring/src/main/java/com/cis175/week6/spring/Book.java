package com.cis175.week6.spring;

public class Book {

	private long id;
	private String title;
	private double price;
	
	// Default constructor
	public Book () {
		
	}
	
	// Constructor using all variables
	public Book (long id, String title, double price) {
		
		this.id = id;
		this.title = title;
		this.price = price;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
