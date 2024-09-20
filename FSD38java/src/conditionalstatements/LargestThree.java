package conditionalstatements;

import java.util.Scanner;

public class LargestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Three digit Values:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		number(num1,num2,num3);
		

	}

	public static void number(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("Largest Number 1: "+num1);
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println("Largest Number 2: "+num2);
		}else {
			System.out.println("Largest Number 3: "+num3);
		}
			
	}

}
