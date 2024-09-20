package strings;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the words");
		String str=sc.nextLine();
		System.out.println(checkReverse(str));

	}

	public static String checkReverse(String str) {
		String result = "";
		
		for(int i = str.length()-1;i >= 0;i--) {
			
				result+= str.charAt(i);
		}
		return result;
		
		
	}
   
}
