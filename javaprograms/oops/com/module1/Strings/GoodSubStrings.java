package com.module1.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GoodSubStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input letters: ");
		String s=sc.nextLine();
		System.out.println("Enter the Good Letters string: ");
		String goodLetters =sc.nextLine();
		System.out.println("Enter the Maximum acceptable number of bad characters: ");
		int k=sc.nextInt();
		
		System.out.println(countGoodSubStrings(s, goodLetters,k));
	}

	public static int countGoodSubStrings(String s, String goodLetters, int k) {
		int n=s.length();
		Set<String> goodSubStrings = new HashSet<>();
		for(int i=0;i<n;i++) {
			int badCount =0;
			for(int j=i;j<n;j++) {
				char currentChar =s.charAt(j);
				
				if(goodLetters.charAt(currentChar - 'a') =='0' ) {
					badCount++;
				}
				if(badCount <= k) {
					goodSubStrings.add(s.substring(i, j+1));
				}else {
					break;
				}
			}
		}
		return goodSubStrings.size();
	}

}
