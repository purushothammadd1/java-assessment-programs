package patterns;

import java.util.Scanner;

public class TriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value :");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=n) {
			//int p=i;
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
