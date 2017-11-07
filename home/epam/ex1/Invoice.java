package home.epam.ex1;

/**
 * Счет
 * 
 * @author Yuriy Sirotenko
 */
public class Invoice {
	
	/**
	 * ID счета
	 */
	private Integer id;
	
	/**
	 * ID пользователя
	 */
	private Integer userId;
	
	/**
	 * Статус
	 */
	private Statuses status;
	
	/**
	 * Общая сумма
	 */
	private Double totalPrice;

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Statuses getStatus() {
		return this.status;
	}

	public void setStatus(Statuses status) {
		this.status = status;
	}
}
