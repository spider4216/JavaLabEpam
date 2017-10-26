package books;

public class Main {
	public static void main(String args[]) {
		Book javaBook = new Book();
		javaBook.setIsbn("t11aa");
		javaBook.setAuthor("Herbert Schildt");
		javaBook.setName("Java: The Complete Reference, Ninth Edition");
		javaBook.setCover(Covers.SOLID);
		javaBook.setCurrency(Currency.RUB);
		javaBook.setPrice(2_979);
		javaBook.setStock(true);
		
		System.out.println(javaBook);
	}
}
