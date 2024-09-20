package conditionalstatements;

import java.util.Scanner;

public class VowelCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char choice=vc.next().charAt(0);
		vowelCharacter(choice);

	}

	public static void vowelCharacter(char choice) {
		// TODO Auto-generated method stub
		switch(choice) {
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
			System.out.println(choice + " is vowel");
			break;
		default:
				System.out.println(choice +" is consonant");
		}
		
	}

}
