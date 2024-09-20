package practice;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println(checkStrongNumber(num));


	}
	public static int factorial(int num) {

		int res=1;
		for(int i = num;i >= 1;i--) {
			res *= i;
		}
		return res;

	}

	public static boolean checkStrongNumber(int num) {
		int temp = num;
		int sum = 0;

		while(num > 0) {
			sum += factorial(num % 10);
			num=num/10;
		}
		return (temp==sum)? true:false;


	}

}
