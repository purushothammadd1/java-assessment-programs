package com.cn.basics;

public class StringtoInt {
	public static int convertStringToInt(String input) {
		if(input.length() ==1) {
			return input.charAt(0) - '0';
		}
		int smallOuput =convertStringToInt(input.substring(0,input.length()-1));
		int lastDigit =input.charAt(input.length()-1) -'0';
		return smallOuput*10+lastDigit;
		
	}

}
