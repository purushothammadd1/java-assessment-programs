package com.student_mange;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student stud) {
		//jdbc code 
		boolean f=false;
		try {
			Connection con=DbConnection.createC();
			String qrl="insert into student(sname,sphone,scity) values(?,?,?)";
			//preparedstatement 
			PreparedStatement ptst =con.prepareStatement(qrl);
			//set the values of parameter
			ptst.setString(1,stud.getStudentName());
			ptst.setString(2,stud.getStudentPhone());
			ptst.setString(3,stud.getStudentCity());

			//execute the query
			ptst.executeUpdate();
			f=true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		boolean f=false;
		try {
			Connection con=DbConnection.createC();
			String qrld="delete from student where sid=?;";
			//preparedstatement 
			PreparedStatement ptst =con.prepareStatement(qrld);
			//set the values of parameter
			ptst.setInt(1, userId);

			//execute
			ptst.executeUpdate();
			f=true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;


	}

	public static boolean showAllStudent() {
		boolean f=false;
		try {
			Connection con=DbConnection.createC();
			String qrld="select * from student;";
			//preparedstatement 
			Statement ptst =con.createStatement();

			//set the values of parameter and execute the query
			ResultSet set=ptst.executeQuery(qrld);

			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString("scity");
				
				System.out.println("Id:"+id);
				System.out.println("Name: "+name);
				System.out.println("PhoneNumber: "+phone);
				System.out.println("City:"+ city);
				System.out.println("*************************");
			}

			f=true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
