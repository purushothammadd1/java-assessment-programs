package com.basics.Numbers;

import java.util.Scanner;

public class ConvertTemp {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the celsius:");
		double farhenhit,celi=sc.nextDouble();
		
		farhenhit=((celi*9)/5)+32;
		System.out.println("Temp of farhenhit "+farhenhit);
		
		
	}
		
	

	
		

}
