package books;

/**
 * Country
 * 
 * Класс "Страна"
 * 
 * 29.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 1.0
 */
public class Country {
	
	/**
	 * Наименование страны
	 */
	private String name;
	
	/**
	 * Площадь
	 */
	private double area;
	
	/**
	 * @param name
	 */
	public void setCountryName(String name) {
		this.name = name;
	}
	
	/**
	 * @param area
	 */
	public void setCountryArea(double area) {
		this.area = area;
	}
	
	/**
	 * @return
	 */
	public String getCountryName() {
		return this.name;
	}
	
	/**
	 * @return
	 */
	public double getCountryArea() {
		return this.area;
	}
}
