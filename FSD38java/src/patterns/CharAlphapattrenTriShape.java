package patterns;

import java.util.Scanner;

public class CharAlphapattrenTriShape {
	public static void main(String[] args) {
		Scanner tri=new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n=tri.nextInt();
		
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
//				char jthChar =(char)('A' + j-1);
				System.out.print(i);
				
			}
			System.out.println();
			
		}
	}
}
