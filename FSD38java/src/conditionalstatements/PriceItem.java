package conditionalstatements;

import java.util.Scanner;

public class PriceItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shopping amount:");
		int amount=sc.nextInt();
		discountPrice(amount);

	}

	public static void discountPrice(int amount) {
		// TODO Auto-generated method stub
		if(amount<10000) {
			System.out.println("You got a 10% discount offer.");
			System.out.println("your amount is: "+(amount-(amount*10)/100));
		}
		else if(amount>=10000 && amount<=20000) {
			System.out.println( "You got an 20% discount offer.");
			System.out.println("your amount is: "+(amount-(amount*20)/100));
		}
		else{
			System.out.println("You got an 25% discount offer.");
			System.out.println("your amount is: "+(amount-(amount*25)/100));
		}
		
		
		
		
	}

}
