package employeedb;

import java.sql.Date;
import java.sql.SQLException;

public class EmployeeAttendanceTester {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO =new EmployeeDAO();
		AttendanceDAO attendanceDAO =new AttendanceDAO();
		try {
			Employee kalyan =employeeDAO.findById(1);
			attendanceDAO.markAttendance(kalyan, new Date(System.currentTimeMillis()), true);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
