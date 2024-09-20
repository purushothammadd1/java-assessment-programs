package strings;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the data:");
		String str=sc.nextLine();
		checkCharacter(str);

	}

	public static void checkCharacter(String str) {
		// TODO Auto-generated method stub
		if(str.isEmpty()) {
			System.out.println("Empty String");
		}else {
			int vowelCount =0,consonantCount =0,digitCount=0,splCharcount=0;
			for(int i=0;i<str.length();i++) {
				if(Character.isLetter(str.charAt(i))) {
					if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u') {
						vowelCount++;
					}
					else {
						consonantCount++;
					}
				}else if(Character.isDigit(str.charAt(i))) {
					digitCount++;
				}else {
					splCharcount++;
				}
			}
			System.out.println("No of Vowels: "+vowelCount+"\n No of Consonants: "+consonantCount+"\n No of digits: "+digitCount+"\n No of special character: "+splCharcount);
				System.out.println(" Given String "+ str);
		}
		
	}

}
