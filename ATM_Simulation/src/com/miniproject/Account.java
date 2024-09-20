package com.miniproject;

public class Account {
	
	private int accountNumber;
	private String name;
	private int pin;
	private double balance;
	
	//constructor chaining
	//Deafult Constructor
	public Account() {
		
	}
	//Parameteried Constructor
	public Account(String name, int pin, double balance) {
		this.name=name;
		this.pin=pin;
		this.balance=balance;
	}
	public Account(String name,int pin) {
		this.name=name;
		this.pin=pin;
		this.balance=0;
	}
	public Account(int accountNumber, String name,int pin,double balance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.pin=pin;
		this.balance=balance;
	}
	
	//creating the getter and setters 
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Account [\naccountNumber=" +accountNumber+"\nName :"+name +"\nBalance :"+balance +"]";
	}
}