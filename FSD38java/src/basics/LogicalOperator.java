package basics;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values: ");
		int num1=sc.nextInt();
		System.out.println("===AND Logical Operator===");
		if(num1%5==0 && num1%10==0) {
			System.out.println("The number is Divisible by both 5 and 10:");
		}
		else {
			System.out.println("The number is not divisible by both 5 and 10:");
		}
		
		System.out.println("====*===OR logical Operator===*===");
		if(num1%5==0 || num1%10==0) {
			System.out.println("The number is divisible by both 5 and 10 in OR operator:");
			
		}
		else {
			System.out.println("The number is not divisible by both in OR operator");
		}
	}
}
