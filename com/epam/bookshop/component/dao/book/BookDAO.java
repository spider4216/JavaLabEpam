package com.epam.bookshop.component.dao.book;

import java.util.ArrayList;

import com.epam.bookshop.entity.Book;

public interface BookDAO {
	public Integer insertBook() throws Exception;
	
	public Boolean deleteBook();
	
	public ArrayList<Book> findBooks();
}
