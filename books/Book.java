package books;

/**
 * Book
 * 
 * Класс продукта - книга
 * 
 * 26.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 1.0
 */
public class Book extends Product {
	private String isbn;
	
	private String author;
	
	private String name;
	
	private String cover;
	
	/**
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param cover
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}
	
	/**
	 * @return String
	 */
	public String getIsbn() {
		return this.isbn;
	}
	
	/**
	 * @return String
	 */
	public String getAuthor() {
		return this.author;
	}
	
	/**
	 * @return String
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * @return String
	 */
	public String getCover() {
		return this.cover;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + this.isbn + ", author=" + this.author + 
				", name=" + this.name + ", cover=" + this.cover + 
				", price=" + this.getPrice() +", stock=" + this.isStock() + 
				", currency=" + this.getCurrency() + "]";
	}
}
