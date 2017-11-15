package com.epam.bookshop.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Methods of this class help us work with strings
 * 
 * @author Yuriy Sirotenko
 */
public class TextFormatHelper {
	
	private static final String DELIMETER_SENTENCE = ". ";
	
	/**
	 * Remove all HTML tags from string
	 * 
	 * @param text
	 * @return
	 */
	public static String removeHtmlTags(String text) {
		String strPattern = "(<+[a-zA-Z]+|<\\/[a-zA-Z]+)>+";
		Pattern pattern = Pattern.compile(strPattern);
		Matcher matcher = pattern.matcher(text);

		return matcher.replaceAll("");
	}
	
	/**
	 * First word in sentence became upper after use this method
	 * 
	 * @param text
	 * @return
	 */
	public static String toUpperCaseInSentences(String text) {
		String[] sentences = text.split("(\\.|\\. )");
		
		if (sentences.length == 0) {
			return text;
		}
		
		StringBuffer finalText = new StringBuffer();
		
		for (String item : sentences) {
			String prepareText = item.trim().substring(0, 1).toUpperCase() + item.trim().substring(1);
			
			finalText.append(prepareText).append(DELIMETER_SENTENCE);
		}
		
		return finalText.toString();
	}
}
