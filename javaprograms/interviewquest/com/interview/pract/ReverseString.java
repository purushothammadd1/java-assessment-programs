package com.interview.pract;

public class ReverseString {
	public static String reverseWord(String str) {
		String ans="";
		for(int i=str.length() -1;i>=0;i++) {
			ans += str.charAt(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		String str="Table"; //output:elbaT
		System.out.println(reverseWord1(str));
	}
	public static String reverseWord1(String str) {
		StringBuilder reverse =new StringBuilder(str);
		return reverse.reverse().toString();
	}
}
