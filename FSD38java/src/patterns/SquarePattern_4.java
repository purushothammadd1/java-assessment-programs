package patterns;

import java.util.Scanner;

public class SquarePattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sq=new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n=sq.nextInt();
		
		for(int currRow=1;currRow<=n;currRow++) {
			for(int currCol=1;currCol<=n;currCol++) {
				System.out.print(n);
			}
			System.out.println();
		}
//		System.out.println();

	}

}
