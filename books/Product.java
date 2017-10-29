package books;

/**
 * Product
 * 
 * Класс "Продукт выпускаемый издательсвом"
 * 
 * 26.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 2.0
 */
public class Product extends PublishOffice {
	
	/**
	 * Валюта
	 */
	public enum Curency {
		KZT, RUB
	}

	/**
	 * Цена
	 */
	private double price;
	
	/**
	 * В наличии
	 */
	private boolean stock;
	
	/**
	 * Валюта
	 */
	private Curency currency;
	
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
	public void setCurrency(Curency currency) {
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
	public Curency getCurrency() {
		return this.currency;
	}
	
	/**
	 * @return double
	 */
	public double getPrice() {
		return this.price;
	}
}
