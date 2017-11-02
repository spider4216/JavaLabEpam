package com.epam.hm1;

/**
 * Корзина пользователя
 * 
 * @author Yuriy Sirotenko
 */
public class Cart {

	/**
	 * Книга
	 */
	private Book book;
	
	/**
	 * Пользователь
	 */
	private User user;

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
