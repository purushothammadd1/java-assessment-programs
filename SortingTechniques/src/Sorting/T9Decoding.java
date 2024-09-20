package Sorting;

import java.util.ArrayList;
import java.util.List;

public class T9Decoding {
	    private static final String[] T9_KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	    public static List<String> getAllT9Decodings(String t9) {
	        List<String> result = new ArrayList<>();
	        if (t9 == null || t9.length() == 0) {
	            return result;
	        }

	        backtrack(result, "", t9, 0);
	        return result;
	    }

	    private static void backtrack(List<String> result, String current, String t9, int index) {
	        if (index == t9.length()) {
	            result.add(current);
	            return;
	        }

	        int digit = t9.charAt(index) - '0';
	        String letters = T9_KEYS[digit];
	        for (int i = 0; i < letters.length(); i++) {
	            char c = letters.charAt(i);
	            backtrack(result, current + c, t9, index + 1);
	        }
	    }

	    public static void main(String[] args) {
	        String t9 = "57";
	        List<String> decodings = getAllT9Decodings(t9);
	        System.out.println(decodings);
	    }
	}


