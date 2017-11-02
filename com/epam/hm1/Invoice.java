package com.epam.hm1;

/**
 * Счет
 * 
 * @author Yuriy Sirotenko
 */
public class Invoice {

	/**
	 * Корзина пользователя
	 */
	private Cart cart;
	
	/**
	 * Общая сумма
	 */
	private double totalPrice;

	public Cart getCart() {
		return this.cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
