package com.epam.homework.task5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StAXExample {
	private StringBuffer accum = new StringBuffer();
	
	private ArrayList<PublicationBean> items = new ArrayList<>();
	private PublicationBean item;
	
	public void parse() throws FileNotFoundException, XMLStreamException {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		
		XMLStreamReader reader = inputFactory.createXMLStreamReader(new FileInputStream("com/epam/homework/task5/xml/source/publication.xml"));
		
		while (reader.hasNext()) {
			int type = reader.next();
			
			switch (type) {
				case XMLStreamConstants.START_ELEMENT:
					if (reader.getLocalName().equals("item")) {
						item = new PublicationBean();
					}
					break;
				case XMLStreamConstants.CHARACTERS:
					accum = new StringBuffer();
					accum.append(reader.getText());
					break;
				case XMLStreamConstants.END_ELEMENT:
					switch (reader.getLocalName()) {
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
					
					if (reader.getLocalName().equals("item")) {
						items.add(item);
					}
					
					break;
			}
		}
	}
	
	public ArrayList<PublicationBean> getPublications() {
		return items;
	}
}
