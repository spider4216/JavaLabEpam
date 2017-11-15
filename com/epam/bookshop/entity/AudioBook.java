package com.epam.bookshop.entity;

/**
 * 
 * @author Yuriy Sirotenko
 */
public class AudioBook extends Book {
	
	/**
	 * Duration of audio book in minutes
	 */
	private String duration;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
