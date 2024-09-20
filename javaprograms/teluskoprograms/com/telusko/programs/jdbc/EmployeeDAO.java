package com.telusko.programs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDAO {
	private EmployeeDepartmentDAO departmentDAO;
	private static final String FIND_BY_ID ="select * from Employee where EmpId = ?";
	
	public EmployeeDAO() {
		this.departmentDAO=new EmployeeDepartmentDAO();
	}
	public Employee findByID(int id) throws SQLException {
		Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "javauser", "password");
		Employee employee = null;
		PreparedStatement pstmt = cnx.prepareStatement(FIND_BY_ID);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if (!(rs.next()))
			return null;
		EmployeeDepartment department = departmentDAO.findByID(rs.getInt("depId"));
		employee = new Employee(rs.getInt("EmpId"), rs.getString("EmpName"), department);
		return employee;
	}

}
