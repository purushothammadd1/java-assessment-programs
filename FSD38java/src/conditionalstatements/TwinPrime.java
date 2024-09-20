package conditionalstatements;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
//		twinPrimeNUmber(num1, num2);
		
		if(twinPrimeNumber(num1,num2))
			System.out.println("Twin Prime");
		else
			System.out.println("Not a Twin Prime");
	}

	public static boolean twinPrimeNumber(int num1,int num2) {
		return (isPrime(num1) && isPrime(num2) && Math.abs(num1-num2)==2);
				
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n<=1) return false;
		if(n<=3) return true;
		
		if(n%2==0||n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6)
			if(n%i==0|| n%(i+2)==0)
				return false;
		return true;
	}

	

}
