package conditionalstatements;

import java.util.Scanner;

public class PalindromeNumber {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Enter a n value:");
		int s=0;
		int n=sc.nextInt();
		int temp=n;
		System.out.println(palindromeNumber(n, s,temp));
		

	}

	public static String palindromeNumber(int n, int s, int temp) {
		while(n>0) {
			int r = n%10;
			s=(s*10)+r;
			n=n/10;
		}
		String res=(temp==s)?"Palindrome Number":"Not a palindrome";
//		if(temp==s) {
//			System.out.println("Palindrome Number");
//			
//		}
//		else {
//			System.out.println("Not a palindrome");
//		}
		return res;
		
	}
}
