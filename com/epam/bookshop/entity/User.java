package com.epam.bookshop.entity;

import java.util.UUID;

import com.epam.bookshop.list.Gender;

/**
 * User
 * 
 * @author Yuriy Sirotenko
 */
public class User {
	
	/**
	 * User ID
	 */
	private String id;

	/**
	 * User name
	 */
	private String username;
	
	/**
	 * Gender
	 */
	private Gender gender;
	
	/**
	 * Age
	 */
	private Integer age;
	
	/**
	 * First name
	 */
	private String firstName;
	
	/**
	 * Last name
	 */
	private String lastName;
	
	public User() {
		this.id = UUID.randomUUID().toString();
	}

	public String getUserName() {
		return this.username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
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

	public String getId() {
		return this.id;
	}
}
