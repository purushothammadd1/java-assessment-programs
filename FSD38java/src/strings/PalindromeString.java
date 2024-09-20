package strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Names:");
		String name=sc.nextLine();
		checkPalindrome(name);

	}

	public static void checkPalindrome(String name) {
		String res ="";
		for(int i=name.length()-1;i>=0;i--) {
			res +=name.charAt(i);
		}
		if(name.toLowerCase().equals(res.toLowerCase())) {
			System.out.println(name+" is a palindrome String");
		}
		else {
			System.out.println(name+"is not a palindrome String");
		}
			
		
	}

	

}
