package methods;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Addition using method 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first Number: ");
		int number1=sc.nextInt();
		
		System.out.println("Enter the second Number:");
		int number2=sc.nextInt();
		
		//int sum=performAddition(number1,number2);
		System.out.println("Addition of two numbers:" + performAddition(number1,number2));
	}

	private static int performAddition(int num1,int num2) {
		// TODO Auto-generated method stub
		int result=num1 + num2;
		return result;
	}

}
