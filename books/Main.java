package books;import books.PrintedProduct.PrintTypes;

public class Main {
	public static void main(String args[]) {
		Book javaBook = new Book();

		javaBook.setCountryName("Russia");
		javaBook.setCountryArea(17_100_000);
		javaBook.setCityName("Moscow");
		javaBook.setShopName("OZON");
		javaBook.setShopAddress("ул. Арбат, д. 10");
		javaBook.setShopPhone("+7 495 730 67 67 ");
		javaBook.setBooksCount(3_800);
		javaBook.setPrintType(PrintedProduct.PrintTypes.PLANOGRAPHIC);
		javaBook.setCurrency(Product.Curency.RUB);
		javaBook.setPrice(2_979);
		javaBook.setStock(true);
		javaBook.setOfficeName("Oracle Press");
		javaBook.setOfficeAddress("Oracle Address");
		javaBook.setIsbn("t11aa");
		javaBook.setAuthor("Herbert Schildt");
		javaBook.setName("Java: The Complete Reference, Ninth Edition");
		javaBook.setCover(Book.Covers.SOLID);
	}
}
