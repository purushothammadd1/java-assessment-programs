package com.interview.pract;

public class SquareNumberSplit {
	public static void main(String[] args) {
		int num=297;
		System.out.println(isKaprekarNumber(num));
	}

	public static String isKaprekarNumber(int num) {
		if(num < 0)
			return "-1";
		if(num == 0)
			return "-2";
		
		String square =""+num*num;
		int half=square.length() / 2;
		int first_half =Integer.parseInt(square.substring(0, half));
		int second_half =Integer.parseInt(square.substring(half));
		if(num == (first_half + second_half))
			return "True";
		return "False";
	}
}
