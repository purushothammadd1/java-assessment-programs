package conditionalstatements;

import java.util.Scanner;

public class FactorialNumber {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number:");
		int num=sc.nextInt();
		int n=1;
		//System.out.println("Enter n value:"+n);
		int i=0;
		long fact=1;
		
		factorialNumber(num,n,fact, i);

	}

	public static void factorialNumber(int num,int n,long fact, int i) {
		// TODO Auto-generated method stub
		for(i=n;i<=num;i++)
			fact=fact*i;
		System.out.println("Factorial of "+fact +"!");
		
		
	}

}
