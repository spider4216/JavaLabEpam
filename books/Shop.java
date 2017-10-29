package books;

/**
 * Shop
 * 
 * Класс "Магазин"
 * 
 * 29.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 1.0
 */
public class Shop extends City {
	
	/**
	 * Наименование магазина
	 */
	private String shopName;
	
	/**
	 * Адрес магазина
	 */
	private String shopAddress;
	
	/**
	 * Телефон магазина
	 */
	private String shopPhone;
	
	/**
	 * @param name
	 */
	public void setShopName(String name) {
		this.shopName = name;
	}
	
	/**
	 * @param address
	 */
	public void setShopAddress(String address) {
		this.shopAddress = address;
	}
	
	/**
	 * @param phone
	 */
	public void setShopPhone(String phone) {
		this.shopPhone = phone;
	}
	
	/**
	 * @return
	 */
	public String getShopName() {
		return this.shopName;
	}
	
	/**
	 * @return
	 */
	public String getShopAdress() {
		return this.shopAddress;
	}
	
	/**
	 * @return
	 */
	public String getShopPhone() {
		return this.shopPhone;
	}
}
