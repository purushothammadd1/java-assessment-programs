package strings;

import java.util.Scanner;

public class MaxWordLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the words");
		String[] name=sc.nextLine().split(" ");
		System.out.println(checkMaxLength(name));
		
	}

	public static String checkMaxLength(String[] name) {
		String res="";
		int length=0;
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>length) {
				length=name[i].length();
				res=name[i];
			}
		}
			return res+" "+length;
		
	}

}
