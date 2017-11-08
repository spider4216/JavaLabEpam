package home.epam.ex1;

import java.util.UUID;

/**
 * Invoice
 * 
 * @author Yuriy Sirotenko
 */
public class Invoice {

	/**
	 * Invoice ID
	 */
	private String id;
	
	/**
	 * User ID
	 */
	private String userId;
	
	/**
	 * Status
	 */
	private Status status;
	
	/**
	 * Total price of order
	 */
	private Double totalPrice;
	
	public Invoice() {
		this.id = UUID.randomUUID().toString();
	}
	
	public Invoice(String userId, Status status) {
		this.userId = userId;
		this.status = status;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public String getId() {
		return this.id;
	}

	public String getUserId() {
		return this.userId;
	}

	public Status getStatus() {
		return this.status;
	}
}
