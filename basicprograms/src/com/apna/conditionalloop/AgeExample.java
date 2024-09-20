package com.apna.conditionalloop;

import java.util.Scanner;

public class AgeExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Not Adult");
		}
	}

}
