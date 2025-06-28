package com.jlcindia.bookstore.dao;

public class DAOFactory {
	
	static UserDAO UserDAO; 
	
 	static {  	 	
 		UserDAO = new UserDAOImpl(); 
 	} 
 	
 	public static UserDAO getUserDAO() { 
 	 	return UserDAO; 
 	} 
}
