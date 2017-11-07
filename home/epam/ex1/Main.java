package home.epam.ex1;

public class Main {

	public static void main(String[] args) {
		Integer userId = 1;
		Integer productId = 1;
		Integer invoiceId = 1;
		
		
		Book book = new Book();
		book.setId(productId);
		book.setIsbn("123bb55");
		book.setAuthor("Herbert Schildt");
		book.setName("Java 8. The Complete Reference, 9th Edition");
		book.setPages(1376);
		book.setCategory(Categories.SCIENCE);
		book.setCategory(Categories.FANTASTIC);
		book.setPrice(9_999.0);

		User user = new User();
		user.setId(userId);
		user.setUserName("vasya777");
		user.setFirstName("Vasiliy");
		user.setLastName("Pupkin");
		user.setAge(18);
		user.setGender(Genders.MALE);
		
		Basket cart = new Basket();
		cart.setUserId(user.getId());
		cart.setCount(1);
		cart.setProductId(book.getId());
		
		Invoice invoice = new Invoice();
		invoice.setId(invoiceId);
		invoice.setUserId(user.getId());
		invoice.setStatus(Statuses.PENDING);
		invoice.setTotalPrice(9_999.0);
	}

}
