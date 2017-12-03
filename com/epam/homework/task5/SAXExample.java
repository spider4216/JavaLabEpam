package com.epam.homework.task5;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXExample extends DefaultHandler {
	private StringBuffer accum = new StringBuffer();
	
	private ArrayList<PublicationBean> items = new ArrayList<>();
	private PublicationBean item;
	
	public void startDocument() throws SAXException {
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (localName.equals("item")) {
			item = new PublicationBean();
		}
	}
	
	public void characters(char[] buffer, int start, int length) {
		accum = new StringBuffer();
		accum.append(buffer, start, length);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {		
		switch (localName) {
			case "title":
				item.setTitle(accum.toString());
				break;
			case "type":
				item.setType(accum.toString());
			case "period":
				item.setPeriod(accum.toString());
				break;
			case "index":
				item.setIndex(accum.toString());
				break;
			case "color":
				item.getCharacteristic().put("color", accum.toString());
				break;
			case "volume":
				item.getCharacteristic().put("volume", accum.toString());
				break;
			case "gloss":
				item.getCharacteristic().put("gloss", accum.toString());
				break;
		}
		
		if (localName.equals("item")) {
			items.add(item);
		}
	}
	
	public void endDocument() throws SAXException {
	}
	
	public void error(SAXParseException exception) {
	       System.err.println("ERROR: line " + exception.getLineNumber() + ": "
					+ exception.getMessage());
	}
	
	public ArrayList<PublicationBean> getPublications() {
		return items;
	}
}
