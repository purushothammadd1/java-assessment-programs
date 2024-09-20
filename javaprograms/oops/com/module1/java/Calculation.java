package com.module1.java;

public class Calculation {
	
	public int sum(int val1,int val2) {
		int total = val1+val2;
		System.out.println("Addition of val1 and val2 is: "+ total);
		return total;
	}
	public int getPriceOfPen() {
		int capPrice = 2;
		int penBodyPrice=5;
		int totalPenPrice=sum(capPrice, penBodyPrice);
		return totalPenPrice;
	}
}
