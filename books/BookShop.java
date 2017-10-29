package books;

/**
 * BookShop
 * 
 * Класс "Книжный магазин"
 * 
 * 29.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 1.0
 */
public class BookShop extends Shop {

	/**
	 * Количество книг в магазине
	 */
	private int count;

	/**
	 * @param count
	 */
	public void setBooksCount(int count) {
		this.count = count;
	}

	/**
	 * @return
	 */
	public int getBooksCount() {
		return this.count;
	}
}
