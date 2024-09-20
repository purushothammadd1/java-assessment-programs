package com.telusko.programs.jdbc;

import java.sql.Date;
import java.sql.SQLException;

public class TestMainClass {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		AttendanceDAO attendanceDAO=new AttendanceDAO();
		
		try {
			Employee kalyan=employeeDAO.findByID(1);
			attendanceDAO.markAttendance(kalyan, new Date(System.currentTimeMillis()), true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}