package home.epam.ex1;

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
	 * Количество страниц
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
