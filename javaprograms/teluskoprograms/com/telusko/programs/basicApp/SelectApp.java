package com.telusko.programs.basicApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://TalentSprint";
		String user="root";
		String password="4724";
		Connection cnx=DriverManager.getConnection(url,user,password);
		Statement stmt =cnx.createStatement();
		System.out.println("Statement object is created");
		
		String query="select sid,sname,sage,saddress from student";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
		
		while(rs.next()) {
			int sid=rs.getInt("sid");
			String name=rs.getString("sname");
			int sage=rs.getInt("sage");
			String address=rs.getNString("saddress");
			System.out.println(sid+ "\t"+name+"\t"+sage+"\t"+address);
		}
		rs.close();
		stmt.close();
		cnx.close();
	}

}
