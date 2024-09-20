package practice;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first side :");
		int a =sc.nextInt();
		System.out.println("Enter the second side :");
		int b =sc.nextInt();
		System.out.println("Enter the third side :");
		int c =sc.nextInt();
		
		checkTriangle(a,b,c);
	}

	public static void checkTriangle(int a, int b, int c) {
		if(c ==Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))) {
			System.out.println("The triangle is right angled triangle. ");
		}
		if(a ==b || b==c || a==c ){
			System.out.println("The triangle is isoceles triangle. ");
		}
		
		else {
			System.out.println("The triangle is not of known type .");
		}
		
	}

}
/* check if a triangle is a right angle triangle or isoceles triangle .*/
