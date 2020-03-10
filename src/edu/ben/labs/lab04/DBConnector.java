package edu.ben.labs.lab04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Connects to database
 * 
 * @author Cody
 */
public class DBConnector {

	Connection conn;

	public DBConnector() {
		
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/my_secure_password?user=root&password=Pageup345");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return conn;
	}

}
