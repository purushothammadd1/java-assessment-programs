package nestedloop;

import java.util.Scanner;

public class RightAnglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		checkPattern(num);

	}

	public static void checkPattern(int num) {
		// TODO Auto-generated method stub
		for(int i=1;i<=num;++i) {
			for (int j=1;j<=i;++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
