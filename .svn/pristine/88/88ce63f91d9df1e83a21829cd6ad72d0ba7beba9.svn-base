package edu.ben.labs.lab04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Tests connection to database
 * 
 * @author Mike
 * @version 0.1
 */
public class DBTester {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/my_secure_password";
		String user = "root";
		String password = "JjSvk#1217";

		try {
			Connection myconn = DriverManager.getConnection(url, user, password);
			Statement myStmt = myconn.createStatement();
			String query = "insert into User " + "(user_name, master_password, user_id)"
					+ " values ('Mike', 'mikeiscool', '13')";
			myStmt.executeUpdate(query);

			Statement getStuffStatement = myconn.createStatement();

			String sql = "SELECT user_name, master_password, user_id FROM user";

			ResultSet rs;
			rs = getStuffStatement.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getString("user_id"));
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("master_password"));
			}

			Statement deleteStuff = myconn.createStatement();

			String deleteSql = "delete from user where user_id = 13";

			deleteStuff.executeUpdate(deleteSql);

			Statement getStuffStatement2 = myconn.createStatement();

			String sql2 = "SELECT user_name, master_password, user_id FROM user";

			ResultSet rs2;
			rs2 = getStuffStatement.executeQuery(sql);

			while (rs2.next()) {
				System.out.println(rs2.getString("user_id"));
				System.out.println(rs2.getString("user_name"));
				System.out.println(rs2.getString("master_password"));
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
