package patterns;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		diamondPyramidPattern(num);

	}

	public static void diamondPyramidPattern(int num) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=num;i++) {
			for(k=1;k<=num-i;k++) {
				System.out.print("");
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=num-1;i>0;i--) {
			for(k=1;k<=num-i;k++) {
				System.out.print("");
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
