package app.entities;

import java.io.Serializable;
import java.util.UUID;

import app.helpers.TextFormatHelper;
import app.list.Category;

/**
 * Abstract class of product
 * 
 * @author Yuriy Sirotenko
 */
abstract public class Product implements Serializable {
	
	/**
	 * Product ID
	 */
	private String id;
	
	/**
	 * Product name
	 */
	private String name;
	
	/**
	 * Product's price
	 */
	private Double price;
	
	/**
	 * Author
	 */
	private String author;
	
	/**
	 * Product's description
	 */
	private String description;
	
	/**
	 * Category's product
	 */
	private Category[] categories = new Category[10];
	
	/**
	 * Counter of categories
	 */
	private Integer index = 0;
	
	public Product() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setCategory(Category category) {
		this.categories[this.index++] = category;
	}
	
	public Category[] getCategories() {
		return this.categories;
	}

	public String getId() {
		return this.id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = TextFormatHelper.toUpperCaseInSentences(TextFormatHelper.removeHtmlTags(description));
	}
}
