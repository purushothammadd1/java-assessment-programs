package com.modulets.interviewprac;

public class FindSecondMaxDigit {
	
	public static int findSecondMaxDigit(int n) {
		int max =0,secondMax=0,r;
		if(n <= 0)
			return -1;
		while(n > 0) {
			r = n % 10;
			n = n / 10;
			if(r > max) {
				secondMax = max;
				max = r;
			}
			else if(r > secondMax && r != max) {
				secondMax = r;
			}
		}
		
		return secondMax;
	}
	public static void main(String[] args) {
		System.out.println(findSecondMaxDigit(1234));
		System.out.println(findSecondMaxDigit(1233));
		System.out.println(findSecondMaxDigit(18564));
	}

}
