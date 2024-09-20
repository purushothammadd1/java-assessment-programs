package com.interview.pract;

public class RussianMultiplication {
	public static void main(String[] args) {
		int num1 =5;
		int num2 =24;
		System.out.println(getProduct(num1,num2));
	}

	public static int getProduct(int num1, int num2) {
		int sum=0;
		if(num1<=0 || num2 <=0)
			return -1;
		
		while(num1>0)
			if(num1 % 2 != 0)
				sum =sum + num2;
		num2 = num2 * 2;
		num1 = num1 / 2;
		
		return sum;		
	}

}
