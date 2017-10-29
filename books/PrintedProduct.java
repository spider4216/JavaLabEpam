package books;

/**
 * PrintedProduct
 * 
 * Класс "Печатная продукция"
 * 
 * 29.10.2017
 * 
 * @author Yuriy Sirotenko
 * @version 1.0
 */
public class PrintedProduct extends Product {
	
	/**
	 * Типы печатной продукции
	 */
	public enum PrintTypes {
		// Трафаретная печать
		SCREEN,
		// Плоская печать
		PLANOGRAPHIC,
		// Глубокая печать
		INTAGLIO,
		// Высокая печать
		LETTERPRESS,
	}
	
	/**
	 * Тип печатной продукции
	 */
	private PrintTypes printType;
	
	/**
	 * @param type
	 */
	public void setPrintType(PrintTypes type) {
		this.printType = type;
	}
	
	/**
	 * @return
	 */
	public PrintTypes getPrintType() {
		return this.printType;
	}
}
