package conditionalstatements;

import java.util.Scanner;

public class ColtzSequence {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		collatzNumber(n);
	}

	public static void collatzNumber(int n) {
		
		// TODO Auto-generated method stub
		while(n != 1) {
			System.out.println(n +" ");
			if((n&1) == 1)
				n=3*n+1;
			else
				n=n/2;
		}
		System.out.println(n);
		
	}

}
