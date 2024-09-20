package strings;

import java.util.Scanner;

public class ReverseWordsInSentences {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the words");
		String str=sc.nextLine();
		System.out.println(checkReverseSentences(str));

	}

	public static String checkReverseSentences(String str) {
		String res ="";
		
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++)
			res=s[i]+" "+res;
		return "Reversed sentence:"+res;
		
		
		
	}

}
