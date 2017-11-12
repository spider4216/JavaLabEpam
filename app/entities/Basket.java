package app.entities;

import java.util.UUID;

/**
 * Basket's user
 * 
 * @author Yuriy Sirotenko
 */
public class Basket {
	
	/**
	 * Order ID in basket
	 */
	private String id;
	
	/**
	 * Product ID
	 */
	private String productId;
	
	/**
	 * User ID
	 */
	private String userId;
	
	/**
	 * Count of copies
	 */
	private Integer count;
	
	public Basket() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return this.id;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
