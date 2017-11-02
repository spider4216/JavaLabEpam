package com.epam.hm1;

/**
 * Статус пользователей
 * 
 * @author Yuriy Sirotenko
 */
public class User {
	
	/**
	 * Имя пользователя
	 */
	private String userName;
	
	/**
	 * Профиль
	 */
	private Profile profile;
	
	/**
	 * Статус
	 */
	private UserStatuses status;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public UserStatuses getStatus() {
		return this.status;
	}

	public void setStatus(UserStatuses status) {
		this.status = status;
	}
}
