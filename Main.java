import app.entities.Basket;
import app.entities.Book;
import app.entities.Invoice;
import app.entities.User;
import app.list.Category;
import app.list.Gender;
import app.list.Status;

public class Main {

	public static void main(String[] args) {		
		Book book = new Book();
		book.setIsbn("123bb55");
		book.setAuthor("Herbert Schildt");
		book.setName("Java 8. The Complete Reference, 9th Edition");
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
	}

}
