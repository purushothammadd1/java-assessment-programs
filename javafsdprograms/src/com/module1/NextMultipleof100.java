package com.module1;

public class NextMultipleof100 {
	public static int nextMultipleOf100(int num) {
		return (num / 100+1)*100;
	}
	public static void main(String[] args) {
		System.out.println(nextMultipleOf100(1287));
	}
}