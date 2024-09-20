package com.modulets.interviewprac;

public class PositiveString {
	public static boolean isValidString(String str) {
		String letters ="abcdefghijklmnopqrstuvwxyz";
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(letters.indexOf(str.charAt(i)) == -1)
				return false;
		}
		return true;
	}
	public static boolean isPostiveString(String str) {
		str = str.toLowerCase();
		for(int i=0;i<str.length() -1;i++) {
			if(str.charAt(i) > str.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str="Apple";
		if(isValidString(str)) {
			System.out.println(isPostiveString(str));
		}else {
			System.out.println("Invalid String");
		}
	}
}
