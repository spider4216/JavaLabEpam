package com.epam.bookshop.component.dao.factory;

import com.epam.bookshop.component.dao.book.IBookDAO;

public abstract class DAOFactory {
	public static final int MYSQL = 1;
	
	public abstract IBookDAO getBookDAO();
	
	public static DAOFactory getDAOFactory(Integer whichFactory) {
		switch (whichFactory) {
			case MYSQL :
				return new MYSQLDAOFactory();
			default :
				return null;
		}
	}
}
