package conditionalstatements;

import java.util.Scanner;

public class FibonanicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int a=0;
		
		int b=1;
		int c;
		System.out.println(a+" "+b);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			
		a=b;
		b=c;
		}
	}

}
