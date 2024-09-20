package jdbcclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



	public class DeptConnector {
		private static final String GET_ALL_STUDENTS = "select * from student";
		private static final String QUERY_A ="SELECT rollNo, CONCAT(firstName, ' ', lastName) AS fullName, DATE_FORMAT(dateofBirth, '%d-%m-%Y') AS DOB\r\n" + "FROM student\r\n"
				+ "WHERE SUBSTRING(firstName, 3, 1) = 'n'";
		private static final String QUERY_C = "select * from department where length(deptName) between ? and ?";
		private static final String QUERY_H = "select * from student where city like '% %'";
		private static final String QUERY_I = "select * from student where dateOfBirth = (select min(dateOfBirth) from student);";
		
		public static void main(String[] args) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter lower limit of department name length ");
				int lower = sc.nextInt();
				System.out.println("Enter upper limit");
				int upper = sc.nextInt();
				Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/purushotham", "root", "4724");
				PreparedStatement pstmtA =cnx.prepareStatement(QUERY_A);
				PreparedStatement pstmtC = cnx.prepareStatement(QUERY_C);
				pstmtC.setInt(1, lower);
				pstmtC.setInt(2, upper);
				boolean hasResults = pstmtC.execute();
				ResultSet rsC = null;
				if (hasResults) {
					rsC = pstmtC.getResultSet();
				}
				List<Department> departments = new ArrayList<>();
				Statement stmtH = cnx.createStatement();
				ResultSet rsH = stmtH.executeQuery(QUERY_H);
				List<Student> studentsH = new ArrayList<> ();
				Statement stmtI = cnx.createStatement();
				ResultSet rsI = stmtI.executeQuery(QUERY_I);
				rsI.next();
				Student studentI = new Student(rsI);
				if (rsC != null)
					while (rsC.next()) {
						departments.add(new Department(rsC));
					}
				while (rsH.next()) {
					studentsH.add(new Student(rsH));
				}
				cnx.close();
				System.out.println("Problem C");
				for (Department d : departments) {
					System.out.println(d.getDeptCode() + " " + d.getDeptName());
				}
				System.out.println("Problem H");
				System.out.println(studentsH);
				System.out.println("Problem I");
				System.out.println(studentI);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	}



