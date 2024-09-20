package com.module1;

public class PowOf2 {

	public static void main(String[] args) {
		System.out.println(isPowOf2(120));
	}

	public static boolean isPowOf2(int num) {
		int powOf2 =1;
		while(powOf2 <= num) {
			if(powOf2 == num)
				return true;
			powOf2 *= 2;
		}
		return false;
	}
}
