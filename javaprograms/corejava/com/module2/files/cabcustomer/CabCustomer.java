package com.module2.files.cabcustomer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class CabCustomer {
	
	private int custId;
	private String customerName;
	private long phone;
	
	public CabCustomer() {
		
	}
	
	public CabCustomer(ResultSet rs) throws SQLException{
		this.custId=rs.getInt("custId");
		this.customerName=rs.getString("customerName");
		this.phone=rs.getLong("phone");
	}
	public CabCustomer(int custId, String customerName,long phone) {
		this.custId=custId;
		this.customerName=customerName;
		this.phone=phone;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId=custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustName(String customerName) {
		this.customerName=customerName;
	}
	public long getPhone() {
		return phone;
	}
	public void setCustPhone(long phone) {
		this.phone=phone;
	}

	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(custId, customerName, phone);
	}

	@Override
	public boolean equals(Object other) {
		if(!(other instanceof CabCustomer))
			return false;
		CabCustomer otherCabCustomer= (CabCustomer) other;
		return otherCabCustomer.phone == this.phone;
	}
	
	
}
