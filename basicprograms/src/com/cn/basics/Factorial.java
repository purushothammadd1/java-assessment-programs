package com.cn.basics;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return (n*factorial(n-1));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is:"+factorial(n));
	}

}
