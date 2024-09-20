package methods;

import java.util.Scanner;

public class MethodSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the values of a:");
		int number1=sc.nextInt();
		
		System.out.println("Enter the values of b: ");
		int number2=sc.nextInt();
		
		System.out.println(swap(number1,number2));
	
	}

	private static String swap(int number1, int number2) {
		// TODO Auto-generated method stub
		int temp=0;
		temp=number1;
		number1=number2;
		number2=temp;
		return "After Swapping " + number1 + " " +number2;
	}

}
