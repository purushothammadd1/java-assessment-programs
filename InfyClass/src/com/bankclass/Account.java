package com.bankclass;

public class Account {
	private double balance=500.00;// instance variable
	static int minimumBalance =200; //static variable
	private double getBalance(int accountId) {
		int withdrawal =500; //local variable
		return balance - withdrawal;
	}
	public static void main(String[] args) {
		Account accnt=new Account();
		double value=accnt.getBalance(123456);
		System.out.println(accnt.balance);
		System.out.println("The balance is: "+ value);
	}

}
