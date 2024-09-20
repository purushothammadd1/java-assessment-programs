package com.modulets.interviewprac;

public class RussianMultiplication {
	public int getProduct(int num1, int num2) {
		if(num1 < 0 || num2 < 0)
			return -1;
		
		int sum =0;
		
		while(num1 > 0) {
			if(num1 % 2 != 0) {
				sum =sum + num2;
			}
			num2 = num2 * 2;
			num1 = num1 / 2;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(new RussianMultiplication().getProduct(11, 12));
		
	}
}
