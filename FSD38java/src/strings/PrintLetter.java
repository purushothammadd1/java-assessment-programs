package strings;

import java.util.Scanner;

public class PrintLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the letters:");
		int count=0;
		String name=sc.next();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='-') {
				count++;
			}
		}
		String[] name2=name.split("-");
		for(int i=0;i<count;i++) {
			System.out.println("-");
		}
		for(int i=0;i<name2.length;i++) {
			System.out.println(name2[i]);
		}
	}

}
