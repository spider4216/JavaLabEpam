package home.epam.ex1;

/**
 * Корзина пользователя
 * 
 * @author Yuriy Sirotenko
 */
public class Basket {
	
	/**
	 * ID заказа в корзине
	 */
	private Integer id;
	
	/**
	 * ID продукта
	 */
	private Integer productId;
	
	/**
	 * ID пользователя
	 */
	private Integer userId;
	
	/**
	 * Количество экземпляров
	 */
	private Integer count;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
