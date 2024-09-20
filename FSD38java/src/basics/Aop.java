package basics;

import java.util.Scanner;

public class Aop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the value for Arithmatic operator: ");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
		System.out.println("Addition operator:"+(num1+num2));
		
		//Subtraction operator
		
		System.out.println("Subtraction operator: "+ (num1-num2));
		//mul operator
		System.out.println("Muliplication operator values:"+(num1*num2));
		//div operator
		System.out.println("DIvision operator:"+(num1/num2));
		//modulos operator
		System.out.println("modulos operator:"+(num1%num2));
		System.out.println(num1++);
		System.out.println(--num1);
		

	}

}
