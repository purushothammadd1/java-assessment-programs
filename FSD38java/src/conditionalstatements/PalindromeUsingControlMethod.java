package conditionalstatements;

import java.util.Scanner;

public class PalindromeUsingControlMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int num=sc.nextInt();
		checkPalindrome(num);
	}
	public static void checkPalindrome(int num) {
		// TODO Auto-generated method stub
		if(getReverse(num)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
public static boolean getReverse(int num) {
		// TODO Auto-generated method stub
		int sum=0,rem=0,temp=0;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;	
		}
		return temp==sum;
}
}