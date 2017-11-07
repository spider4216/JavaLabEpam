package home.epam.ex1;

/**
 * Абстрактный класс продукта
 * 
 * @author Yuriy Sirotenko
 */
abstract public class Product {
	
	private Integer id;
	
	/**
	 * Наименование продукта
	 */
	private String name;
	
	/**
	 * Цена продукта
	 */
	private Double price;
	
	/**
	 * Автор
	 */
	private String author;
	
	/**
	 * Категория продукта
	 */
	private Categories[] categories = new Categories[10];
	
	private Integer index = 0;
	
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setCategory(Categories category) {
		this.categories[this.index++] = category;
	}
	
	public Categories[] getCategories() {
		return this.categories;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
