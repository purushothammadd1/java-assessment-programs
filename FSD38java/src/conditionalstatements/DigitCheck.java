package conditionalstatements;

import java.util.Scanner;

public class DigitCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digits:");
		int num=sc.nextInt();
		
		System.out.println(digitCheck(num));

	}

	public static String digitCheck(int num) {
		// TODO Auto-generated method stub
		
			if(9999<num && num<=99999)
				return "Num is 5 digits";
			
			return "Num is not in 5 digit";
		
	}
}
