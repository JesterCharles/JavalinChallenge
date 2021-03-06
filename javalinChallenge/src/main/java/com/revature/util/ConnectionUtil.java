package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() throws SQLException{
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Problem has occured. Check that connection.");
		}

    	String url = "jdbc:postgresql://localhost:5432/postgres";
    	String username = "postgres";
    	String password = "password";
		
		// Run -> Run Configuration -> Environment -> then create key/value pairs for these credentials\
		// Might need to stretch window out to see environment tab
//		String url = System.getenv("URL");
//		String username = System.getenv("USERNAME");
//		String password = System.getenv("PASSWORD");
		
		return DriverManager.getConnection(url, username, password);
	}
}
