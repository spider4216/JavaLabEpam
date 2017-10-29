package books;

/**
 * Shop
 * 
 * Класс "Город"
 * 
 * 29.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 1.0
 */
public class City extends Country {
	
	/**
	 * Наименование города
	 */
	private String name;
	
	/**
	 * @param name
	 */
	public void setCityName(String name) {
		this.name = name;
	}
	
	/**
	 * @return
	 */
	public String getCityName() {
		return this.name;
	}
}
