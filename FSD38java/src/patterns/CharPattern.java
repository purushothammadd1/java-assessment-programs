package patterns;

import java.util.Scanner;

public class CharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a row value:");
//		int row=sc.nextInt();
//		System.out.println("Enter a column value:");
//		int column=sc.nextInt();
		charPattern(5);
		

	}

	public static void charPattern(int n) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 7;i++) {
			for(int j = 1; j <= 7;j++) {
				if((i != 1 && (j == 1  || j == 7)) ||(i == 1 && j % 2 == 0) ||(i == 4 && j % 2 != 0) ) {
					System.out.print("A");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

		
		
	}

}
