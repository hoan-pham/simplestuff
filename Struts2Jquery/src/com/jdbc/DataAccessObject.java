package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataAccessObject {
	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection != null)
			return connection;
		else {
			// Store the database URL in a string
		String serverName = "127.0.0.1";
		String portNumber = "3306";
		String sid = "tutorial_db";
		String dbUrl = "jdbc:mysql://" + serverName + ":" + portNumber
				+ "/" + sid;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		// set the url, username and password for the database
		connection = DriverManager.getConnection(dbUrl, "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	}
}