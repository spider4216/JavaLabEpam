package com.epam.homework.task5;

import java.util.HashMap;

public class PublicationBean {
	private String title;
	
	private String type;
	
	private String period;
	
	private HashMap<String, String> characteristic = new HashMap<>();
	
	private String index;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public HashMap<String, String> getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(HashMap<String, String> characteristic) {
		this.characteristic = characteristic;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
}
