package nestedloop;

import java.util.Scanner;

public class ArrowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		arrowPattern(5);
		

	}

	public static void arrowPattern(int num) {
		// TODO Auto-generated method stub
		for (int i=0;i<=num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}
		
		for(int i=num;i>=0;i--) {
			for(int j=0;j<=i-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
			
		}
	}

}