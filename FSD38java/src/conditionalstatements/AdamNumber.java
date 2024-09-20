package conditionalstatements;

import java.util.Scanner;

public class AdamNumber {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number:");
			int num=sc.nextInt();
			primeNumber(num);
		}
	}
	public static void primeNumber(int num) {
		int y=reverse(num);
		int xSquare=square(num);
		int ySquare=square(y);
		if(xSquare == reverse(ySquare)) {
			System.out.println("Adam Number");
		}else {
			System.out.println("Not a Adam Number");
		}	
	}
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev= rev*10+digit;
			num=num/10;
		}
		return rev;
	}
	public static int square(int num) {
		return (num*num);
	}

}
