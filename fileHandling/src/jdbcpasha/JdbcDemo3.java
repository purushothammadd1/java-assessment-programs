package jdbcpasha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo3 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pst =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Scanner sc= new Scanner(System.in);


			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd38","root","4724");
			String choice;
			pst=con.prepareStatement("insert into stud values(?,?,?)");
			do {
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				pst.setInt(1, id);
				System.out.println("Enter name:");
				String name=sc.next();
				pst.setString(2, name);
				System.out.println("Enter marks:");
				double marks=sc.nextDouble();
				pst.setDouble(3, marks);
				int x=pst.executeUpdate();
				System.out.println(x+" rows inserted..");
				System.out.println("Do you want more (Y/N)?");
				choice=sc.next();

			}
			while(choice.equalsIgnoreCase("Y"));
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
