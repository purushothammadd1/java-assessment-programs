package conditionalstatements;

import java.util.Scanner;

public class PostiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		int number =sc.nextInt();
		System.out.println(checkNumber(number));

	}

	public static String checkNumber(int number) {
		// TODO Auto-generated method stub
		if(number>=0)
			return "positive Number";
		return "Number is not Positive";
		
	}

}
