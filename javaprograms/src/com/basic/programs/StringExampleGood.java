package com.basic.programs;

public class StringExampleGood {
	public static void main(String[] args) {
		String str="good";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				System.out.println(i);
			}
		}
	}

}
