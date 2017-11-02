package com.epam.hm1;

/**
 * Книга
 * 
 * @author Yuriy Sitotenko
 */
public class Book extends Product {
	
	/**
	 * ISBN книги
	 */
	private String isbn;
	
	/**
	 * Автор
	 */
	private String author;
	
	/**
	 * Количество страниц
	 */
	private int pages;
	
	/**
	 * Наименование книги
	 */
	private String name;

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return this.pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
