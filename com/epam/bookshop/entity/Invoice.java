package com.epam.bookshop.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.epam.bookshop.list.Status;

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
	
	/**
	 * Date when invoice was created
	 */
	private Date dateCreated;
	
	public Invoice(String userId, Status status) {
		this.userId = userId;
		this.status = status;
		this.id = UUID.randomUUID().toString();
		this.dateCreated = new Date();
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
	
	public String getCreatedDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.y");
		return dateFormat.format(this.dateCreated);
	}
}
