package com.epam.homework.task5;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMExample {
	private ArrayList<PublicationBean> items = new ArrayList<>();
	
	public void parse() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse("com/epam/homework/task5/xml/source/publication.xml");
		Element root = document.getDocumentElement();
		
		NodeList items = root.getElementsByTagName("item");
		
		
		for (int i = 0; i < items.getLength(); i++) {
			//System.out.println(items.item(i).getNodeName());
			Element item = (Element)items.item(i);
			
			PublicationBean pb = new PublicationBean();
			
			Element titleElement = (Element)item.getElementsByTagName("title").item(0);
			Element typeElement = (Element)item.getElementsByTagName("type").item(0);
			Element periodElement = (Element)item.getElementsByTagName("period").item(0);
			Element indexElement = (Element)item.getElementsByTagName("index").item(0);
			
			
			pb.setTitle(titleElement.getFirstChild().getNodeValue());
			pb.setType(typeElement.getFirstChild().getNodeValue());
			pb.setPeriod(periodElement.getFirstChild().getNodeValue());
			
			// Он может быть NULL по схеме
			if (indexElement != null) {
				pb.setIndex(indexElement.getFirstChild().getNodeValue());
			}
			
			Element characteristic = (Element)item.getElementsByTagName("characteristic").item(0);
			
			Element colorElement = (Element)characteristic.getElementsByTagName("color").item(0);
			Element volumeElement = (Element)characteristic.getElementsByTagName("volume").item(0);
			Element glossElement = (Element)characteristic.getElementsByTagName("gloss").item(0);
			
			pb.getCharacteristic().put("color", colorElement.getFirstChild().getNodeValue());
			pb.getCharacteristic().put("volume", volumeElement.getFirstChild().getNodeValue());
			pb.getCharacteristic().put("gloss", glossElement.getFirstChild().getNodeValue());
			
			this.items.add(pb);
		}
	}
	
	public ArrayList<PublicationBean> getPublications() {
		return items;
	}
}
