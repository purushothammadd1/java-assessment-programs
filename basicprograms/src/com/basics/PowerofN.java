package com.basics;

public class PowerofN {

	public static void main(String[] args) {
		int base = 30;
		int exponent = 2740;
		int rightmostNonZeroDigit = calculateRightmostNonZeroDigit(base, exponent);
		System.out.println("Rightmost Non-Zero Digit: " + rightmostNonZeroDigit);
	}

	public static int calculateRightmostNonZeroDigit(int base, int exponent) {
		int result = 1;
		for (int i = 1; i <= exponent; i++) {
			result = (result * base) % 10;
		}
		return result;
	}
}



