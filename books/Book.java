package books;

/**
 * Book
 * 
 * Класс "Книга"
 * 
 * 26.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 2.0
 */
public class Book extends PrintedProduct {
	
	/**
	 * Типы обложек
	 */
	public enum Covers {
		SOLID, SOFT
	}
	
	/**
	 * ISBN
	 */
	private String isbn;
	
	/**
	 * Автор книги
	 */
	private String author;
	
	/**
	 * Наименование книги
	 */
	private String name;
	
	/**
	 * Тип обложки
	 */
	private Covers cover;
	
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
	public void setCover(Covers cover) {
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
	public Covers getCover() {
		return this.cover;
	}
	
	
}
