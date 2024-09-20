package conditionalstatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(leapYear(year)) {
			System.out.println(year+" is a Leap Year.");
		}
		else {
			System.out.println(year+" is not a Leap Year!");
		}
	}
	public static boolean leapYear(int year) {
		return year % 400 ==0 || (year % 4 ==0 && year % 100 != 0);
	}
}
