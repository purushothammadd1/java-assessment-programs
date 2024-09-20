package basics;

import java.util.Scanner;

public class TernaryScanner {
	public static void main() {
		System.out.println("Enter the Ternary values:");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The num1:");
		int val1 =sc.nextInt();
		System.out.println("Enter The num2:");
		int val2 =sc.nextInt();
		System.out.println("The Ternary operator are:" + ( val1<val2?val1+val2:val1-val2));
		
		
	}

}
