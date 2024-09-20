package practice;

import java.util.Scanner;

/*check if the nth power of a number is even or not(Take the number, and the power as input. */
public class PowerofN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("Enter the power : ");
		int n=sc.nextInt();
		
		double result=Math.pow(num, n);
		checkPowerEven(num,n,result);
	}

	public static void checkPowerEven(int num, int n, double result) {
		// TODO Auto-generated method stub
		if(result % 2 ==0) {
			System.out.println("result is even.");
		}
		else {
			System.out.println("result is odd. ");
		}
		
	}

}
