package com.bankApp;

import java.util.Scanner;

public class BankTester {
	public static void main(String[] args) {
		int customerId =0;
		Bank bank=new Bank();
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println("Select Your Choice");
			System.out.println("**********************");
			System.out.println("1.Add Customer");
			System.out.println("2. Show Customers");
			System.out.println("3. Show Customer By Id");
			System.out.println("4. Deposit ");
			System.out.println("5. Withdraw");
			System.out.println("6. Check Balance");
			System.out.println("7. Fund Transfer");
			System.out.println("8. Exit");

			System.out.println("Enter Your choice: ");
			int choice =sc.nextInt();
			System.out.println();
			switch (choice) {
			case 1:
				System.out.println("Enter First Name: ");
				String firstName =sc.next();

				System.out.println("Enter Last Name: ");
				String lastName =sc.next();

				System.out.println("Enter address: ");
				String address =sc.next();

				System.out.println("Enter Balance: ");
				double balance=sc.nextDouble();

				Customer customer =new Customer(firstName, lastName,address,balance);
				bank.addCustomer(customer);
				break;
			case 2:
				bank.showCustomers();
				break;
			case 3:
				System.out.println("Enter Customer ID: ");
				customerId =sc.nextInt();
				bank.showCustomerById(customerId);
				break;
			case 4:
				System.out.println("Enter Customer ID: ");
				customerId = sc.nextInt();
				System.out.println("Enter the amount you want to Deposit: ");
				int deposit = sc.nextInt();
				bank.depositMoney(customerId,deposit);
				break;
			case 5:
				System.out.println("Enter Customer ID: ");
				customerId = sc.nextInt();
				System.out.println("Enter the amount you want to withdraw: ");
				int withdraw = sc.nextInt();
				bank.withdrawMoney(customerId,withdraw);
				break;

			case 6:
				System.out.print("Enter Customer ID: ");
				customerId = sc.nextInt();
				bank.showBalance(customerId);
				break;
			case 7:
				System.out.println("Transfer From ID:");
				int fromId = sc.nextInt();
				System.out.println("Transfer To ID:");
				int toId = sc.nextInt();
				System.out.println("Enter the amount to be Transferred: ");
				int amount = sc.nextInt();
				bank.fundTransfer(fromId, toId, amount);
				break;


			case 8:System.out.println("Thank you ");
			System.out.println("Application will be terminated!...\n");
			System.exit(0);
			break;

			default:System.out.println("Invalid choice...\n");
			break;
			}
		}
	}

}
