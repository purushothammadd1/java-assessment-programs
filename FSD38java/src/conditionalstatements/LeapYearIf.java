package conditionalstatements;

import java.util.Scanner;

public class LeapYearIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		System.out.println(checkYear(year));
	}
	public static String checkYear(int year) {
		// TODO Auto-generated method stub
		if(year%400 ==0 || (year%4==0 && year%100 !=0)) {
			return "Leap Year";
		}else {
			return "Not a Leap Year";
		}
	}
}
