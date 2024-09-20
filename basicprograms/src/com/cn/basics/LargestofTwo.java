package com.cn.basics;

import java.util.Scanner;

public class LargestofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value of a,b:");
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		
		if(a>b) {
			System.out.println("first num is greater");
		}
		else {
			System.out.println("second num is greater");
		}
		System.out.println("outside if else");

	}

}
