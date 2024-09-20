//package com.files;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Admin {
//	
//	private static final String INCREMENT_BY_GROUP = "update EMPLOYEE set salary = salary * ? where sal_group = ?";
//	private static final String SEARCH_BY_GROUP = "select * from EMPLOYEE where sal_group = ?";
//	private static final String SAVE_EMPLOYEE = "insert into EMPLOYEE values (?, ?, ?, ?)";
//	
//	private Connection cnx = null;
//	
//	private Connection makeConnectionToDB() throws SQLException {
//		if (cnx == null || cnx.isClosed())
//			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
//				"javauser",
//				"javapassword");
//		return cnx;
//	}
//	
//	public void closeConnection() throws SQLException {
//		cnx.close();
//	}
//	
//	public boolean incrementSalaryBy (String group, float inc) {
//		try {
//			Connection cnx = makeConnectionToDB();
//			PreparedStatement stmt = cnx.prepareStatement(INCREMENT_BY_GROUP);
//			stmt.clearParameters();
//			stmt.setFloat(1, (1 + inc / 100.0f));
//			stmt.setString(2, group);
//			return stmt.execute();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
//	
//	public List<Employee> getAllEmployeesinGroup (String group) {
//		List<Employee> employees = new ArrayList<> ();
//		try {
//			Connection cnx = makeConnectionToDB();
//			PreparedStatement stmt = cnx.prepareStatement(SEARCH_BY_GROUP);
//			stmt.setString(1, group);
//			ResultSet rs = stmt.executeQuery();
//			
//			while (rs.next()) {
//				employees.add(new Employee(
//						rs.getInt("id"),
//						rs.getString("name"),
//						rs.getFloat("salary"),
//						rs.getString("sal_group")));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} 
//		
//		return employees;
//	}
//	
//	public boolean saveEmployee (Employee e) {
//		try {
//			Connection cnx = makeConnectionToDB();
//			PreparedStatement stmt = cnx.prepareStatement(SAVE_EMPLOYEE);
//			stmt.clearParameters();
//			stmt.setInt(1, e.getId());
//			stmt.setString(2, e.getName());
//			stmt.setFloat(3, e.getSalary());
//			stmt.setString(4, e.getGroup());
//			stmt.execute();
//			return true;
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		return false;
//	}
//	
//	public static void main (String[] args) {
//		Admin admin = new Admin();
////		System.out.println("fetching all employees in Group A before increment");
////		List<Employee> employees = admin.getAllEmployeesinGroup("A");
////		System.out.println(employees);
////		System.out.println("Incrementing by 10%");
////		admin.incrementSalaryBy("A", 10);
////		employees = admin.getAllEmployeesinGroup("A");
////		System.out.println(employees);
//		Employee e = new Employee(10, "Jesus", 10000, "D");
//		admin.saveEmployee(e);
//		try {
//			admin.closeConnection();
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//		}
//	}
//
//}
