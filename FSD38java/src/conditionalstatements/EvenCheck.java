package conditionalstatements;

import java.util.Scanner;

public class EvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Ev=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num=Ev.nextInt();
		evenNumber(num);

	}

	public static int evenNumber(int num) {
		// TODO Auto-generated method stub
		
		if(num%2==0) 
			System.out.println("It is the Even number:");
		System.out.println(num +" is the Odd Number:");
		return 0;
	}
}

