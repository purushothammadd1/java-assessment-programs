package jdbcpasha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {
			//driver loading
//			Class.forName("com.mysql.jdbc.driver");
			
			//Establishing connection	
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd38","root", "4724");
				}
			 catch (SQLException e) {
				e.printStackTrace();
			}
		finally {
			con.close();
		}
	}

}
