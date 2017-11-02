package com.epam.hm1;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		book.setIsbn("123bb55");
		book.setAuthor("Herbert Schildt");
		book.setName("Java 8. The Complete Reference, 9th Edition");
		book.setPages(1376);
		book.setCategory(Categories.SCIENCE);
		book.setPrice(9_999);
		
		Profile profile = new Profile();
		profile.setFirstName("Vasiliy");
		profile.setLastName("Pupkin");
		profile.setAge(18);
		profile.setGender(Genders.MALE);
		
		User user = new User();
		user.setUserName("vasya777");
		user.setStatus(UserStatuses.ACTIVE);
		user.setProfile(profile);
		
		Cart cart = new Cart();
		cart.setBook(book);
		cart.setUser(user);
		
		Invoice invoice = new Invoice();
		invoice.setCart(cart);
		invoice.setTotalPrice(9_999);
	}

}
