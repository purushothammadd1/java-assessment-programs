package com.bankApp;

public class Customer {
	private static int counter = 1001;
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String address;
	private double balance;
	
	public Customer() {
		
	}
	public Customer(String firstName,String lastName,String address,double balance) {
		this.customerId=counter++;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.balance=balance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", balance=" + balance + "]";
	}
	

}
