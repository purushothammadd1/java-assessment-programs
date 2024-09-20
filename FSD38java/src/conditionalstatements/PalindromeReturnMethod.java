package conditionalstatements;

import java.util.Scanner;

public class PalindromeReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println(isPalindrome(num));
}
	public static int isPalindrome(int num) {
		if(num<=0) {
			return -1;
		}
		else if(num>999 || (num<100)){
			return -2;	
		}
		else {
			if(palindrome(num)) {
				return 1;
			}
		}
		return 0;
	}
	public static boolean palindrome(int num) {
		// TODO Auto-generated method stub
		boolean check=(num%10 ==num/100)?true:false;
		return check;
	}	
}