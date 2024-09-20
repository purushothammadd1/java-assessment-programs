package com.telusko.programs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDepartmentDAO {
	
	private static final String FIND_BY_ID ="select * from department where depId = ?";
	

	public EmployeeDepartment findByID(int id) throws SQLException {
		Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "4724");
		PreparedStatement pstmt = cnx.prepareStatement(FIND_BY_ID);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		EmployeeDepartment employeeDepartment = null;
		if (rs.next())
			employeeDepartment = new EmployeeDepartment(rs.getInt("depId"), rs.getString("depName"), rs.getDouble("salary"));
		cnx.close();
		return employeeDepartment;

	}

}
