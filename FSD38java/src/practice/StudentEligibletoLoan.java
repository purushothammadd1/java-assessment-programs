package practice;

import java.util.Scanner;

/*A Government wants to provide student loans to students in their country.
 * But in-order for a student to be eligible to get a student loan, he/she must be in age range 17 to 21, and must have a minimum
 * of 80% score in academics. write a program to accept the name, age and marks of a student and display if he/she is eligible for the loan or not.
 * 
 */

public class StudentEligibletoLoan {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Student name:");
		String name=sc.nextLine();
		System.out.println("Enter the Student age:");
		int age=sc.nextInt();
		System.out.println("Enter the Student marks:");
		double marks=sc.nextDouble();
		checkToEligibleLoan(name,age,marks);
	}

	public static void checkToEligibleLoan(String name, int age, double marks) {
		if(age >= 17 && age <= 21 && marks >= 80) //condition-1
		{
			System.out.println(name + " is eligible.");
			
		}
		else {
			System.out.println(name + " is not eligible.");
		}
	}
}
