package app.entities;

/**
 * Book
 * 
 * @author Yuriy Sitotenko
 */
public class Book extends Product {
	
	/**
	 * ISBN's book
	 */
	private String isbn;
	
	/**
	 * Page numbers
	 */
	private Integer pages;

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getPages() {
		return this.pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}
}
