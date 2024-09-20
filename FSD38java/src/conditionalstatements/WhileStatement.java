package conditionalstatements;

import java.util.Scanner;

public class WhileStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=100;
		int temp=0;
		while(n>0) {
			n=n/10;
			temp=n%10;
			System.out.println(temp + " "+n);
			System.out.println(n);}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int temp=0;
		tempStatement(n, temp);

	}

	public static void tempStatement(int n, int temp) {
		// TODO Auto-generated method stub
		while(n>0) {
			n=n/10;
			temp=n%10;
			System.out.println(temp+" "+n);
		}
		System.out.println(n);
		
	}

}
