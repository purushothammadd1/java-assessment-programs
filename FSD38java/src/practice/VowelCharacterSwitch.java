package practice;

import java.util.Scanner;

public class VowelCharacterSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the single Letter:");
		char name=sc.next().charAt(0);
		vowelLetter(name);
	}

	public static void vowelLetter(char name) {
		// TODO Auto-generated method stub
		switch(name) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			
			System.out.println(name + " is vowel");
			break;
			default:
				if((name>='a'&&name<='z')||(name>='A'&&name<='Z')) {
					System.out.println(name + " is consonant");
					break;
				}
				
			System.out.println("Input is not an alphabet");
		}
		
	}

}
