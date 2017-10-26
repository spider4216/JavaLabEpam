package books;

/**
 * Product
 * 
 * Абстрактный класс продукт
 * 
 * 26.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 1.0
 */
public abstract class Product {
	private double price;
	
	private boolean stock;
	
	private String currency;
	
	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @param stock
	 */
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
	/**
	 * @param currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	/**
	 * @return boolean
	 */
	public boolean isStock() {
		return this.stock;
	}
	
	/**
	 * @return String
	 */
	public String getCurrency() {
		return this.currency;
	}
	
	/**
	 * @return double
	 */
	public double getPrice() {
		return this.price;
	}
}
