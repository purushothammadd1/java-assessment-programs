package Intro.oops.bank;

public class BankAccount {
	private double balance; // account balance
	
	public BankAccount(double openingBalance) {
		//constructor
		balance =openingBalance;
	}
	public void deposit(double amount) {
		//makes deposit
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		//makes withdrawal
		balance = balance - amount;
	}
	public void display() {
		//display balance
		System.out.println("Balance=" + balance);
	}
}