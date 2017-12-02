package com.epam.bookshop.component.dao.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.epam.bookshop.entity.Book;

public class MYSQLBookDAO implements IBookDAO {
	
	private Connection connection = null;
	
	private Book entity = null;
	
	public static final Integer COLUMN_ID = 1;
	
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
		String sqlInsert = "INSERT INTO books (name, price, author, description, isbn, pages) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pr = connection.prepareStatement(sqlInsert);
			pr.setString(COLUMN_NAME, entity.getName());
			pr.setDouble(COLUMN_PRICE, entity.getPrice());
			pr.setString(COLUMN_AUTHOR, entity.getAuthor());
			pr.setString(COLUMN_DESCRIPTION, entity.getDescription());
			pr.setString(COLUMN_ISBN, entity.getIsbn());
			pr.setInt(COLUMN_PAGES, entity.getPages());
			
			return pr.executeUpdate();
		} catch (SQLException e) {
			throw new Exception("Cannot get prepare statment instance", e);
		}
	}

	// TODO not checking
	public Boolean deleteBook() throws Exception {
		String sqlDelete = "DELETE FROM books WHERE id = ?";
		
		try {
			PreparedStatement pr = connection.prepareStatement(sqlDelete);
			pr.setInt(COLUMN_ID, entity.getId());
			
			pr.executeUpdate();
			return true;
		} catch (SQLException e) {
			throw new Exception("Cannot get prepare statment instance", e);
		}
	}

	public ArrayList<Book> findBooks() {
		return null;
	}
	
	public Book findBook(Integer id) throws Exception {
		String sqlFind = "SELECT * FROM books WHERE id = ?";
		
		try {
			PreparedStatement pr = connection.prepareStatement(sqlFind);
			pr.setInt(COLUMN_ID, id);
			
			ResultSet rs = pr.executeQuery();
			rs.next();
			Book book = new Book();
			book.setId(rs.getInt("id"));
			book.setName(rs.getString("name"));
			book.setPrice(rs.getDouble("price"));
			book.setAuthor(rs.getString("author"));
			book.setDescription(rs.getString("description"));
			book.setIsbn(rs.getString("isbn"));
			book.setPages(rs.getInt("pages"));
			
			return book;
		} catch (SQLException e) {
			throw new Exception("Cannot get prepare statment instance", e);
		}
	}

}
