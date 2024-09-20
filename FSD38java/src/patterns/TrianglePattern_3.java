package patterns;

import java.util.Scanner;

public class TrianglePattern_3 {
	public static void main(String[] args) {
		Scanner tp=new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n=tp.nextInt();
		
		int i=1;
		while( i<=n ) {
			int p=i;//p=i i<=4
			int j=1;
			while( j<=i ) {
				System.out.print(p);
				p++;
				j++;
			}
			System.out.println();
			i ++;
		}
		
		
	}
}
