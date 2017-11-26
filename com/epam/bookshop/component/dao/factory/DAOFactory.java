package com.epam.bookshop.component.dao.factory;

import com.epam.bookshop.component.dao.book.BookDAO;

public abstract class DAOFactory {
	public static final int MYSQL = 1;
	
	public abstract BookDAO getBookDAO();
	
	public static DAOFactory getDAOFactory(Integer whichFactory) {
		switch (whichFactory) {
			case MYSQL :
				return new MYSQLDAOFactory();
			default :
				return null;
		}
	}
}
