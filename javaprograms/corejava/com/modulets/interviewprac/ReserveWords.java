package com.modulets.interviewprac;

public class ReserveWords {
	public static String reverse(String str) {
		if(str == null)
			return null;
		if(str.isEmpty())
			return null;
		
		String reverseWords ="";
		String[] words = str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			reverseWords += new StringBuffer(words[i]).reverse().toString()+" ";
		}
		return reverseWords.substring(0, reverseWords.length()-1);
	}
	public static void main(String[] args) {
		System.out.println(reverse("talent sprint"));
	}

}
