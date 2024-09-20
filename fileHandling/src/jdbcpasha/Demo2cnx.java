package jdbcpasha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2cnx {
	public static void main(String[] args) {
		Connection cnx=null;
		Statement st=null;
		ResultSet rs= null;
		try {
//			Class.forName("com.mysql.jdbc.driver");


			cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd38","root","4724");
			st =cnx.createStatement();
			int x=st.executeUpdate("insert into stud values(1,'Sai Kiran',80)");
			System.out.println(x+"row inserted...");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
