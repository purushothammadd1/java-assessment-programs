package com.javaguides.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsers1{
	private static final String INSERT_MULIPLE_USERLOGIN_SQL="INSERT INTO USERS1"+
			"VALUES(3,'purushotham','purushothammaddi@gmail.com','India','123'),"+
			"(2,'saipavan','saipavan@gmail.com','IND','2345')," 
					+ "(3,'Harish','Harishm06@gmail.com','India','4536');";
	public static void main(String[] args) {
		InsertUsers1 createTableExample=new InsertUsers1();
		
		createTableExample.insertRecord();
	}
	public void insertRecord() {
		//TODO Auto-generated method stub
		//step 1:Establishing a connection
		try(
				Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin?useSSl=false","root","4724");
				//step 2 create a statement using connection object
				Statement stmt=cnx.createStatement();){
			//step 3 Execute the query or update query
			int result =stmt.executeUpdate(INSERT_MULIPLE_USERLOGIN_SQL);
			System.out.println("No of records affected: " +result);
		} catch(SQLException e) {
			//print sql exception information
			printSQLException(e);
		}
		//step-4 try-with resource statement will auto close the connection
		
	}
	public void printSQLException(SQLException ex) {
		// TODO Auto-generated method stub
		for(Throwable e:ex) {
			if(e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLSate: "+((SQLException) e).getSQLState());
				System.err.println("Error code:"+((SQLException) e).getErrorCode());
				System.err.println("Message:"+e.getMessage());
				Throwable t=ex.getCause();
				while( t!= null) {
					System.out.println("Cause: "+t);
					t=t.getCause();
				}
			}
		}
		
	}
	
}