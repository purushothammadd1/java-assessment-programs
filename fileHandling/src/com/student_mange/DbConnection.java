package com.student_mange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection createC() throws SQLException {
		Connection con = null;
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection
			String url="jdbc:mysql://localhost:3306/student_mange";
			String user="root";
			String password="4724";
			con=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}
