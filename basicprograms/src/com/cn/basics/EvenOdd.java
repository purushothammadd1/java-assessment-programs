package com.cn.basics;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		evenOdd(a);
	}

	public static void evenOdd(int a) {
		int rem = a%2;
		// TODO Auto-generated method stub
		boolean result= rem ==0;
		if(result == true) {
			System.out.println(a +" is a even number..");
		}
		else {
			System.out.println(a + " is a odd number");
		}
		
	}

}
