package com.telusko.programs.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AttendanceDAO {
	
	private String MARK_ATTENDANCE ="insert into Attendence (EmpId,curdate, attendence) values (?,?,?)";
	public boolean markAttendance(Employee employee,Date date,boolean isPresent) throws SQLException {
		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","4724");
		PreparedStatement pstmt=cnx.prepareStatement(MARK_ATTENDANCE);
		pstmt.setInt(1, employee.getEmpId());
		pstmt.setDate(2, date);
		pstmt.setBoolean(3, isPresent);
		int rowsUpdated =pstmt.executeUpdate();
		cnx.close();
		return rowsUpdated == 1;
	}

}
