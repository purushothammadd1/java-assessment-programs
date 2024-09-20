package practice;

import java.util.Scanner;

/*
 * check if the alphabet entered by the user is an uppercase character or a lower case character.*/
public class CharacterType {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your characters: ");
		char ch=sc.next().charAt(0);
		int ascii =(int)ch;
		checkAlphabet(ascii);
		
	}

	public static void checkAlphabet( int ascii) {
		// TODO Auto-generated method stub
		if(ascii>=65 && ascii <= 90) {
			System.out.println("Upper case letter.");
		}
		else if(ascii >97 && ascii <=122) {
			System.out.println("Lower case letter. ");
		}
		else {
			System.out.println("character is not an alphabet. ");
		}
		
	}
}
