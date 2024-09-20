package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConnection;
import com.dto.Employee;

public class EmployeeDAO {
	public Employee getEmployee(String emailId,String password) {
		PreparedStatement pst=null;
		ResultSet rs=null;
		Connection con = null;
		try {
			con = DBConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String qry="select * from employee where emailId=? and password=?";

		try {
			pst=con.prepareStatement(qry);
			pst.setString(1, emailId);
			pst.setString(2, password);

			rs=pst.executeQuery();
			if(rs.next()) {
				Employee emp=new Employee();

				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setGender(rs.getString("gender"));
				emp.setEmailId(rs.getString("emailId"));
				emp.setPassword(rs.getString(6));

				return emp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con !=null) {
				try {
					rs.close();
					pst.close();
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public List<Employee> getAllEmployees() {
		Connection con=null;
		try {
			con = DBConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			pst=con.prepareStatement("select * from employee");
			rs=pst.executeQuery();

			List<Employee> empList=new ArrayList<Employee>();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setGender(rs.getString(4));
				emp.setEmailId(rs.getString(5));
				emp.setPassword(rs.getString(6));

				empList.add(emp);
			}
			return empList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con !=null) {
				try {
					rs.close();
					pst.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public Employee getEmployeeById(int empId) {
		PreparedStatement pst=null;
		ResultSet rs=null;
		Connection con = null;
		try {
			con = DBConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String qry="select * from employee where empId=?";

		try {
			pst=con.prepareStatement(qry);
			pst.setInt(1, empId);
			rs=pst.executeQuery();
			if(rs.next()) {
				Employee emp=new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setGender(rs.getString("Gender"));
				emp.setEmailId(rs.getString("EmailId"));
				emp.setPassword(rs.getString(6));
				return emp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public int registerEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		Connection con=DBConnection.getConnection();
		String qry="Insert into employee values(?,?,?,?,?,?)";
		try {
			pst=con.prepareStatement(qry);
			pst.setInt(1, emp.getEmpId());
			pst.setString(2, emp.getEmpName());
			pst.setDouble(3, emp.getSalary());
			pst.setString(4, emp.getGender());
			pst.setString(5, emp.getEmailId());
			pst.setString(6, emp.getPassword());
			int result=pst.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con !=null) {
				try {
					pst.close();
					con.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		return 0;
	}
}
