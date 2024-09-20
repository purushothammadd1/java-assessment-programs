package conditionalstatements;

import java.util.Scanner;

public class LargestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		largestTwoNumber(num1,num2);
	}

	public static void largestTwoNumber(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num1 == num2) {
			System.out.println("Both are Equal");
		}
		else {
			int largest = (num1>num2)?num1:num2;
			System.out.println("The Largest Number =" + largest);
		}
		
	}

}
