package com.epam.bookshop.component.dao.book;

import java.util.ArrayList;

import com.epam.bookshop.entity.Book;

public interface IBookDAO {
	public Integer insertBook() throws Exception;
	
	public Boolean deleteBook() throws Exception;
	
	public ArrayList<Book> findBooks();
	
	public Book findBook(Integer id) throws Exception;
}
