package conditionalstatements;

import java.util.Scanner;

public class ArithmeticOperatorusingSwitch {
	public static void main(String [] args) {
		int choice;
		do  {
			
			System.out.println(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("==================");
			System.out.println("Enter your choice:");
			System.out.println("==================");
			choice=sc.nextInt();
			performOperation(choice);

		}while(choice!=5);
	}
	public static int readInputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num=sc.nextInt();
		return num;
	}
	public static int readInput() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter second number");
		int num=sc.nextInt();
		return num;
	}
	public static void performOperation(int choice) {
		
		int num1, num2;
		switch (choice) {
		case 1: num1=readInputs();
		num2=readInput();
		System.out.println("================================================");
		System.out.println("Addition of two numbers is " + (num1 + num2));
		System.out.println("================================================");
		break;
		case 2: num1=readInputs();
		num2=readInput();
		System.out.println("================================================");
		System.out.println("Substraction of two numbers is " + (num1 -num2));
		System.out.println("================================================");
		break;
		case 3:
			num1=readInputs();
			num2=readInput();
			System.out.println("================================================");
			System.out.println("Mulitiplication of two Numbers is " +(num1*num2));
			System.out.println("================================================");
			break;
		case 4:
			num1=readInputs();
			num2=readInput();
			System.out.println("================================================");
			System.out.println("Division of two numbers is "+(num1/num2));
			System.out.println("================================================");
			break;
		case 5:
			System.out.println("Thank u for using this program");
			break;
		default:
			System.out.println("Enter the proper choice from the above ");
		}

	}



}
