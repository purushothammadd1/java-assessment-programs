package com.bankApp;

public class Bank {
	int index=0;
	Customer customer[] = new Customer[10];
	
	public void addCustomer(Customer customer) {
		this.customer[index] = customer;
		index++;
		System.out.println("Customer Added Successfully!!! \n");
	}
	public void showCustomers() {
		if(index < 0) {
			System.out.println("Customers Info \n");
			for(int i=0;i<index;i++) {
				System.out.println(customer[i]);
			}
			System.out.println();
		}else {
			System.out.println("No Customers Found!!!");
		}
	}
	public void showCustomerById(int customerId) {
		Customer cust = null;
		for(int i=0;i<index;i++) {
			if(customer[i].getCustomerId() == customerId) {
				cust = customer[i];
				break;
			}
		}
		if(cust != null) {
			System.out.println(cust);
		}else {
			System.out.println("Customer with ID "+ customerId);
		}
	}
	
	public void showBalance(int customerId) {
		Customer cust =null;
		for(int i=0;i<index;i++) {
			if(customer[i].getCustomerId() == customerId) {
				cust = customer[i];
				break;
			}
		}
		if(cust != null) {
			System.out.println(cust.getBalance());
		}else {
			System.out.println("Customer with ID "+ customerId);
		}
	}
	
	public void depositMoney(int customerId,int deposit) {
		Customer cust =null;
		for(int i=0;i<index;i++) {
			if(customer[i].getCustomerId() == customerId) {
				cust = customer[i];
				break;
			}
		}
		if(cust != null) {
			double d= cust.getBalance() + deposit;
			cust.setBalance(d);
			System.out.println("Your new Balance after the deposit is: "+(d));
		}else {
			System.out.println("Customer with ID "+ customerId +" , Not Found!!!");
		}
	}
	public void withdrawMoney(int customerId,int withdraw) {
		Customer cust = null;
		for(int i=0;i<index;i++) {
			if(customer[i].getCustomerId() == customerId) {
				cust =customer[i];
				break;
			}
		}
		if(cust != null) {
			double w= cust.getBalance() - withdraw;
			cust.setBalance(w);
			System.out.println("Your new Balance after the withdraw is : "+ w);
		}else {
			System.out.println("Customer with ID "+ customerId +", Not Found!!!");
		}
	}
	public void fundTransfer(int fromId, int toId, int amount) {
		Customer sender = null;
		Customer receiver = null;
		for(int i=0;i<index;i++) {
			if(customer[i].getCustomerId() == fromId) {
				sender = customer[i];
			}
			if(customer[i].getCustomerId() == toId) {
				receiver = customer[i];
			}
			if(sender != null && receiver != null) {
				break;
			}
		}
		if(sender != null && receiver != null) {
			if(sender.getBalance() >= amount) {
				double senderNewBalance =sender.getBalance() - amount;
				sender.setBalance(senderNewBalance);
				
				double reciverNewBalance =receiver.getBalance() + amount;
				receiver.setBalance(reciverNewBalance);
				
				System.out.println("Transfer of "+ amount +" from customer with ID "+ fromId+" to Customer with ID "+ toId + " completed successfully.");
				System.out.println("Sender's new Balance: "+ senderNewBalance);
				System.out.println("Receiver's New Balance: "+ reciverNewBalance);
			}else {
				System.out.println("Insufficient funds for the transfer.");
			}
		}else {
			System.out.println("Sender or receiver with the specified ID not found.");
		}
		
	}
}
