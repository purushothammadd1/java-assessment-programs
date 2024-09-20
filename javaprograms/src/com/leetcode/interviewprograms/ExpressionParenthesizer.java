package com.leetcode.interviewprograms;

import java.util.LinkedList;
import java.util.List;

public class ExpressionParenthesizer {
	public static List<Integer> diffWaysToCompute(String input){
		List<Integer> ret = new LinkedList<>();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i)== '+') {
				String part1=input.substring(0,i);
				String part2=input.substring(i+1);
//				List<Integer> ret =
//				return null;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		
	}

}
