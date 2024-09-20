package com.module2.files.cabcustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CabCustomerService {
	
	private ArrayList<CabCustomer> customers;
	private Connection cnx=null;
	private String tableName;
	
	private final String GET_ALL_CUSTOMERS ="select * from cabcustomer";
	private final String INSERT_CUSTOMER ="insert into cabcustomer values (?,?,?)";
	
	public CabCustomerService() {
		this.customers=new ArrayList<>();
	}
	public void openConnection() throws SQLException {
		if(cnx == null || cnx.isClosed())
			cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","4724");
	}
	public void closeConnection() throws SQLException {
		cnx.close();
	}
	public CabCustomerService(String tableName) throws SQLException {
		this.tableName=tableName;
		this.customers = new ArrayList<>();
		openConnection();
		PreparedStatement stmt = cnx.prepareStatement(GET_ALL_CUSTOMERS);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			this.customers.add(new CabCustomer(rs));
		}
		closeConnection();
	}
	public void addCabCustomer(CabCustomer c) throws SQLException {
		if(isNewCustomer(c)) {
			customers.add(c);
			openConnection();
			PreparedStatement stmt =cnx.prepareStatement(INSERT_CUSTOMER);
			stmt.clearParameters();
			stmt.setInt(1, c.getCustId());
			stmt.setString(2, c.getCustomerName());
			stmt.setLong(3, c.getPhone());
			stmt.executeUpdate();
			closeConnection();
		}else {
			System.out.println("Already exisiting customer");
		}
	}
	public boolean isNewCustomer(CabCustomer c) {
		return (!(customers.contains(c)));
	}
	
	public String toString() {
		String output ="[\n";
		for(CabCustomer c: customers) {
			output += c.toString();
			output += "\n";
		}
		output += "]";
		return output;
	}
}