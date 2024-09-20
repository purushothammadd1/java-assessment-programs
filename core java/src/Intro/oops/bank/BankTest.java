package Intro.oops.bank;

public class BankTest {
	public static void main(String[] args) {
		BankAccount ba1= new BankAccount(100.00);//create account
		
		System.out.println("before Transactions, ");
		ba1.display();    // display balance
		
		ba1.deposit(74.35); // make deposit
		ba1.withdraw(20.00); // make withdrawal
		
		System.out.println("After Transactions, ");
		ba1.display(); 
	}

}
