package patternsApna;

import java.util.Scanner;

public class InvertedHalfPyramidRotated {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		//outer loop
		for(int i=1;i<=n;i++) {
			//inner loop
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//inner loop-->star print
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
