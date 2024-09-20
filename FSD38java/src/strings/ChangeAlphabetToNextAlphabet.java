package strings;

import java.util.Scanner;

public class ChangeAlphabetToNextAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabets letters:");
		String name=sc.next();
		for(int i=0;i<name.length();i++) {
			checkNextNum(name.charAt(i));
		}
	}

	public static void checkNextNum(char charAt) {
		int num=(int)charAt;
		System.out.print((char)(++num));
		
	}

}
