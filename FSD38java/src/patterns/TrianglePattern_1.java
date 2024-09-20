package patterns;

import java.util.Scanner;

public class TrianglePattern_1 {

	public static void main(String[] args) {
		Scanner tp=new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n=tp.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
