package com.telusko.programs.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Department {
	private String deptCode;
	private String deptName;
	private String address;
	
	public Department(ResultSet rs) throws SQLException {
		deptCode = rs.getString("deptCode");
		deptName = rs.getString("deptName");
		address = rs.getString("address");
	}

	public String getDeptCode() {
		return deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Department [deptCode=" + deptCode + ", deptName=" + deptName + ", address=" + address + "]";
	}


}
