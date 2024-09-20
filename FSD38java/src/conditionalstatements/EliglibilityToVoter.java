package conditionalstatements;

import java.util.Scanner;

public class EliglibilityToVoter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter You Age:");
		int age=sc.nextInt();
		checkEliglible(age);
		

	}

	public static void checkEliglible(int age) {
		// TODO Auto-generated method stub
		if(age>0) {
			if(age>=18)
				System.out.println("Your Eliglible to vote:");
			else
				System.out.println("Not Egliglible to vote wait for 18 years:");
		}
		else
			System.out.println("Invalid age");
		
	}

}
