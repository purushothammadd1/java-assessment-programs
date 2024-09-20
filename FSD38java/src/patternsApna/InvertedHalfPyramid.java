package patternsApna;

import java.util.Scanner;

public class InvertedHalfPyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		//outer loop
		for(int i=n;i>=1;i--) {
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
