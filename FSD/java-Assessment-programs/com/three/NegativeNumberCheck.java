package com.three;

import java.util.Scanner;

public class NegativeNumberCheck {

	public static void checkNumber(int number) throws NegativenumberException {
		if(number < 0) {
			throw new NegativenumberException("Error: Negative number entered!");
		} else {
			System.out.println("You entered a positive Number: "+ number);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		try {
			System.out.println("Enter an Integer: ");
			int number =sc.nextInt();

			checkNumber(number);
		} catch (NegativenumberException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Error: Invalid input, Please enter an integer.");
		}finally {
			sc.close();
		}
	}

}
