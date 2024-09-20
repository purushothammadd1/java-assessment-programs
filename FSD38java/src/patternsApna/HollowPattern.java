package patternsApna;

import java.util.Scanner;

public class HollowPattern {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row:");
		System.out.print("Enter the Column:");
		int r=input.nextInt();
		int c=input.nextInt();
		//outer loop
		for(int i=1;i<=r;i++) {
			//inner loop
			for(int j=1;j<=c;j++) {
				//cell-->(i,j)
				if(i ==1 || j==1 || i ==r || j==c) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
