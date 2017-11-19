import java.util.ArrayList;

import com.epam.bookshop.entity.Basket;
import com.epam.bookshop.entity.Book;
import com.epam.bookshop.entity.Invoice;
import com.epam.bookshop.entity.User;
import com.epam.bookshop.list.Category;
import com.epam.bookshop.list.Gender;
import com.epam.bookshop.list.Status;

public class Main {

	public static void main(String[] args) {		
		Book book = new Book();
		book.setIsbn("123bb55");
		book.setAuthor("Herbert Schildt");
		book.setName("Java 8. The Complete Reference, 9th Edition");
		book.setDescription("Fully <b>updated</b> for <strong>Java SE 8</strong>, Java: The Complete <i>Reference.</i>" +
		"new Java SE 8 features such as lambda expressions. this Oracle Press resource also offers a solid introduction " +
		"to <small>JavaFX</small>");
		book.setPages(1376);
		book.setCategory(Category.SCIENCE);
		book.setCategory(Category.FANTASTIC);
		book.setPrice(9_999.0);

		User user = new User();
		user.setUserName("vasya777");
		user.setFirstName("Vasiliy");
		user.setLastName("Pupkin");
		user.setAge(18);
		user.setGender(Gender.MALE);
		
		Basket basket = new Basket();
		basket.setUserId(user.getId());
		basket.setCount(1);
		basket.setProductId(book.getId());
		
		Invoice invoice = new Invoice(user.getId(), Status.PENDING);
		
		
		System.out.println(book.getDescription());
		System.out.println(invoice.getCreatedDate());
		
//		System.out.println(book.save());
//		ArrayList<Book> books = book.findAll();
//		System.out.println(books.get(1).getName());
		
	}

}
