package patterns;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		int i,j;
		//int row=5;
		int n=5;
		/*for(i=0;i<row;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
		}			
			System.out.println();
			
		}*/
		/*for(i=1;i<row;i++) {
			for(j=2*(row-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}*/
//		for(i=row-1;i>=0;i--) {
//			for(j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(i=1;i<n;i++) {
			for(j=i;j<=n-i;j++)
				System.out.print(" ");
		}
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		
		}
	}

