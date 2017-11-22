package com.epam.bookshop.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.epam.bookshop.entity.Book;

/**
 * Service for Book logic
 * 
 * @author Yuriy Sirotenko
 */
public class BookService {
	
	private static final String DATA_PATH = "data/book/";
	
	private static final String ERR_MESSAGE_FIND = "Ошибка при поиске книг";
	
	private static final String ERR_MESSAGE_SAVE = "Ошибка при сохранении";
	
	private Book book;
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	/**
	 * Save book in file (serialization)
	 * 
	 * @return
	 */
	public Boolean save() throws Exception {
		String filePath = DATA_PATH + this.book.getId();
		
		try (
				FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream  oos = new ObjectOutputStream(fos);
			) {
			oos.writeObject(this.book);
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
