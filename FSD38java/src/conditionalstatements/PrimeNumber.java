package conditionalstatements;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		System.out.println(primeNumber(num));

	}

	public static boolean primeNumber(int num) {
		// TODO Auto-generated method stub
	
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
			return false;
			}
		}
		return true;
		}
}
	
		
		
	


