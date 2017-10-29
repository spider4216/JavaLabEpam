package books;

/**
 * PublishOffice
 * 
 * Класс "Издательство с которым работает книжный магазин"
 * 
 * 29.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 1.0
 */
public class PublishOffice extends BookShop {
	
	/**
	 * Наименование издательства
	 */
	private String officeName;
	
	/**
	 * Адрес издательства
	 */
	private String officeAddress;
	
	/**
	 * @param name
	 */
	public void setOfficeName(String name) {
		this.officeName = name;
	}
	
	/**
	 * @param address
	 */
	public void setOfficeAddress(String address) {
		this.officeAddress = address;
	}
	
	/**
	 * @return
	 */
	public String getOfficeName() {
		return this.officeName;
	}
	
	/**
	 * @return
	 */
	public String getOfficeAddress() {
		return this.officeAddress;
	}
	
	
}
