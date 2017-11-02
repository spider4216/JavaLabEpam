package com.epam.hm1;

/**
 * Абстрактный класс продукта
 * 
 * @author Yuriy Sirotenko
 */
abstract public class Product {
	
	/**
	 * Наименование продукта
	 */
	private String name;
	
	/**
	 * Цена продукта
	 */
	private double price;
	
	/**
	 * Категория продукта
	 */
	private Categories category;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Categories getCategory() {
		return this.category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}
	
	
}
