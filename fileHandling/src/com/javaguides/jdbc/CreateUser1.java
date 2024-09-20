package com.javaguides.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateUser1 {
	private static final String createTableSQL ="create table users1(\r\n" + "id int(3) primary key,\r \n"+
			 "name varchar(20),\r\n"+"email varchar(45),\r\n"+ " country varchar(25),\r\n"+
					 "password varchar(10)\r\n"+");";
	public static void main(String[] args) {
		CreateUser1 user=new CreateUser1();
		user.createTable();
	}
	public void createTable() {
		try {
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","4724");
			//step-2 create a statement using connection object
			Statement stmt=cnx.createStatement();
			//step-3 Execute the query or update query
			stmt.execute(createTableSQL);
			System.out.println("sucesfully created table...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			printSQLException(e);
		}
		
	}
	public void printSQLException(SQLException ex) {
		for(Throwable e:ex) {
			if(e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLSate: "+((SQLException) e).getSQLState());
				System.err.println("Error code:" +((SQLException) e).getErrorCode());
				System.err.println("Message :" +e.getMessage());	
				Throwable t=ex.getCause();
				while(t != null) {
					System.out.println("cause: "+t);
					t=t.getCause();
				}
			}
		}
		
		
	}

}
