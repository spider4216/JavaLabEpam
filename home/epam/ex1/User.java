package home.epam.ex1;

/**
 * Статус пользователей
 * 
 * @author Yuriy Sirotenko
 */
public class User {
	
	private Integer id;

	/**
	 * Имя пользователя
	 */
	private String username;
	
	/**
	 * Пол
	 */
	private Genders gender;
	
	/**
	 * Возраст
	 */
	private Integer age;
	
	/**
	 * Имя
	 */
	private String firstName;
	
	/**
	 * Фамилия
	 */
	private String lastName;

	public String getUserName() {
		return this.username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public Genders getGender() {
		return this.gender;
	}

	public void setGender(Genders gender) {
		this.gender = gender;
	}
	
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
