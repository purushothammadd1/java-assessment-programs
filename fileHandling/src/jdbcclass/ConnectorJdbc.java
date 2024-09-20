package jdbcclass;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectorJdbc {
private static final String GET_ALL_STUDENTS = "select rollNo from student";
	
	public static void main(String[] args) {
		Connection cnx = null;
		
		try {
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/purushotham","root", "4724");
			Statement stmt = (Statement) cnx.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery(GET_ALL_STUDENTS);
			
			while (rs.next()) {
				System.out.println((rs.getString("rollNo")));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
