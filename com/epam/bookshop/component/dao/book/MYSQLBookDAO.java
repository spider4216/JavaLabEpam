package com.epam.bookshop.component.dao.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.epam.bookshop.entity.Book;

public class MYSQLBookDAO implements BookDAO {
	
	private Connection connection = null;
	
	private Book entity = null;
	
	public static final Integer COLUMN_NAME = 1;

	public static final Integer COLUMN_PRICE = 2;

	public static final Integer COLUMN_AUTHOR = 3;

	public static final Integer COLUMN_DESCRIPTION = 4;

	public static final Integer COLUMN_ISBN = 5;

	public static final Integer COLUMN_PAGES = 6;
	
	public MYSQLBookDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void setBookEntity(Book entity) {
		this.entity = entity;
	}

	public Integer insertBook() throws Exception {
		String sql = "INSERT INTO books (name, price, author, description, isbn, pages) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pr = this.connection.prepareStatement(sql);
			pr.setString(this.COLUMN_NAME, this.entity.getName());
			pr.setDouble(this.COLUMN_PRICE, this.entity.getPrice());
			pr.setString(this.COLUMN_AUTHOR, this.entity.getAuthor());
			pr.setString(this.COLUMN_DESCRIPTION, this.entity.getDescription());
			pr.setString(this.COLUMN_ISBN, this.entity.getIsbn());
			pr.setInt(this.COLUMN_PAGES, this.entity.getPages());
			
			return pr.executeUpdate();
		} catch (SQLException e) {
			throw new Exception("Cannot get prepare statment instance", e);
		}
	}

	public Boolean deleteBook() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Book> findBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
