package com.epam.bookshop.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Book
 * 
 * @author Yuriy Sitotenko
 */
public class Book extends Product {
	
	private static final String DATA_PATH = "data/book/";
	
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
	public Boolean save() {
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
			this.errorMessage = e.getMessage();
			return false;
		} catch (IOException e) {
			this.errorMessage = e.getMessage();
			return false;
		}
	}
	
	/**
	 * Get all books
	 * 
	 * @return
	 */
	public Book[] findAll() {
		File file = new File(DATA_PATH);
		Book[] books = new Book[file.listFiles().length];
		// count variable for loop
		int i = 0;
		
		for (File item : file.listFiles()) {
			String path = item.getPath();
			
			try (
					FileInputStream fis = new FileInputStream(path);
					ObjectInputStream ois = new ObjectInputStream(fis);
				) {
				books[i] = (Book)ois.readObject();

				i++;
			} catch (FileNotFoundException e) {
				this.errorMessage = e.getMessage();
				return new Book[0];
			} catch (ClassNotFoundException e) {
				this.errorMessage = e.getMessage();
				return new Book[0];
			} catch (IOException e) {
				this.errorMessage = e.getMessage();
				return new Book[0];
			}
		}

		return books;
	}
}
