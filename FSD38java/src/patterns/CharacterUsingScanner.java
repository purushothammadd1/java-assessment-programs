package patterns;

import java.util.Scanner;

public class CharacterUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a row");
		int rows=sc.nextInt();
		System.out.println("Enter a col");
		int columns=sc.nextInt();
		printPattern(rows,columns);

	}

	public static void printPattern(int rows, int columns) {
		for(int i=1;i<=rows;i++)
		{
			for(int k=1;k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=columns;j++) {
				
			}
			System.out.print((char)(i+65)+" ");
		}
		System.out.println();
		
	}

}
