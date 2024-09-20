package com.bank.application;

public abstract class Customer {
	private int Id;
	private String firstname;
	private String lastname;
//	private String emp;

	public Customer() {
		
	}
	public Customer(int id,String firstname,String lastname) {
		this.Id=id;
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id=id;
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname=lastname;
	}
//abstract method
	public abstract double CalculateSalary();
	
	public String toString() {
		return  "[Employee Id:"+Id+"\n Firstname"+firstname+"\n LastName"+lastname+"]";
//		String.format("% -20s %s%n ","CustomerFullName:"+firstname+" "+lastname);
	}
}
