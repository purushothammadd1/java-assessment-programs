package com.module1.java;

public class Digital {
	public static void updateNumber(int num) {
		num++;
	}
	public static void main(String[] args) {
		Integer num1=Integer.valueOf(10);
		updateNumber(num1);
		System.out.println(num1);
	}

}
