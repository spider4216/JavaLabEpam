package com.epam.bookshop.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Book
 * 
 * @author Yuriy Sitotenko
 */
public class Book extends Product {
	
	private static final String DATA_PATH = "data/book/";
	
	private static final String ERR_MESSAGE_FIND = "Ошибка при поиске книг";
	
	private static final String ERR_MESSAGE_SAVE = "Ошибка при сохранении";
	
	/**
	 * ISBN's book
	 */
	private String isbn;
	
	/**
	 * Page numbers
	 */
	private Integer pages;
	
	/**
	 * Error message for save and find books
	 */
	private String errorMessage;
	
	public String getErrorMessage() {
		return this.errorMessage;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getPages() {
		return this.pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
	/**
	 * Save book in file (serialization)
	 * 
	 * @return
	 */
	public Boolean save() throws Exception {
		String filePath = DATA_PATH + this.getId();
		
		try (
				FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream  oos = new ObjectOutputStream(fos);
			) {
			oos.writeObject(this);
			fos.close();
			oos.close();
			
			return true;
		} catch (FileNotFoundException e) {
			throw new Exception(ERR_MESSAGE_SAVE, e);
		} catch (IOException e) {
			throw new Exception(ERR_MESSAGE_SAVE, e);
		}
	}
	
	/**
	 * Get all books
	 * 
	 * @return
	 */
	public ArrayList<Book> findAll() throws Exception {
		File file = new File(DATA_PATH);
		// create collection with particular capacity
		ArrayList<Book> books = new ArrayList<Book>(file.listFiles().length);
		
		for (File item : file.listFiles()) {
			String path = item.getPath();
			
			try (
					FileInputStream fis = new FileInputStream(path);
					ObjectInputStream ois = new ObjectInputStream(fis);
				) {
				books.add((Book)ois.readObject());
			} catch (FileNotFoundException | ClassNotFoundException e) {
				throw new Exception(ERR_MESSAGE_FIND, e);
			} catch (IOException e) {
				throw new Exception(ERR_MESSAGE_FIND, e);
			}
		}

		return books;
	}
}
