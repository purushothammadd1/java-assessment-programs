package conditionalstatements;

import java.util.Scanner;

public class SumNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		
		int sum=0;
		int i=1;
		sumNaturalNumber(i, n, sum);
		
	}

	public static void sumNaturalNumber(int i, int n ,int sum) {
		// TODO Auto-generated method stub
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of Natural Numbers is " + sum);
		
	}

}
