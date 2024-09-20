package basics;

import java.util.Scanner;

public class VoterEliglible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//voter Eliglible for peoples
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age =in.nextInt();
		System.out.println(age);
		if(18<=age) {
			System.out.println("Your Eliglible for voting");
		}
		else if(age<=0) {
			System.out.println("invalid input:");
		}
		else {
			System.out.println("you not Eliglible for vote... Wait for 18 years!:");
		}
		

	}

}
