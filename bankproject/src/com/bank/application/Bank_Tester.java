package com.bank.application;

public class Bank_Tester {
	public static void main(String[] args) {
		Customer cust1[]=new Customer[10];
		cust1[0]=new HourlyEmployee(1, "purushotham", "maddi", 4, 100);
		cust1[1]=new SalariedEmployee(2, "Harish", "Mekala", 45000);
		cust1[2]=new CommissionEmployee(3, "Sai teja", "mukka", 0.05, 1500,1000000);

		for(int i=0;i<cust1.length;i++) {
			System.out.println(cust1[i]);
			System.out.println("\n");
		}
	}
}
