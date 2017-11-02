package com.epam.hm1;

/**
 * Профиль пользователя
 * 
 * @author Yuriy Sirotenko
 */
public class Profile {
	
	/**
	 * Имя
	 */
	private String firstName;
	
	/**
	 * Фамилия
	 */
	private String lastName;
	
	/**
	 * Пол
	 */
	private Genders gender;
	
	/**
	 * Возраст
	 */
	private int age;

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

	public Genders getGender() {
		return this.gender;
	}

	public void setGender(Genders gender) {
		this.gender = gender;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
