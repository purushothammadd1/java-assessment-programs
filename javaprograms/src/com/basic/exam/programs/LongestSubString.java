package com.basic.exam.programs;

import java.util.HashMap;
import java.util.Map;

/*
 * Longest substring without repeating characters
 * Given a string s, find the length of the longest substring without repeating characters.
 * Example: Input s="abcabcbb"
 * output: 3
 * Explanation: The answer is 'abc', with the length of 3
 * 
 * Input 2:"bbbb"
 * output: 1
 * Explanation: The answer is 'b', with the length of 1.*/
public class LongestSubString {
	public static void main(String[] args) {
		String s="abcabcbb";
		System.out.println("Input: "+s);
		System.out.println("Output: "+longestSubString(s));
	}

	public static int longestSubString(String s) {
		int maxLength= 0;
		int left = 0;
		Map<Character, Integer> charIndexMap =new HashMap<>();
		for(int r=0;r<s.length();r++) {
			char currentChar=s.charAt(r);
			if(charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
				left = charIndexMap.get(currentChar) + 1;
			}
			charIndexMap.put(currentChar, r);
			maxLength = Math.max(maxLength, r - left + 1);
		}
		return maxLength;
	}

}
