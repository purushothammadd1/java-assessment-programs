package com.modulets.interviewprac;

public class StringWithPattern {

	public static String[] getWordsContainsPattern(String[] words, String pattern) {
		int index = 0;
		pattern = pattern.toUpperCase();

		for(String word : words) {
			word = word.toUpperCase();
			if(word.indexOf(pattern) >= 0) {
				index++;
			}
		}

		String[] patternWords = new String[index];
		index =0;
		for(String word: words) {
			word = word.toUpperCase();
			if(word.indexOf(pattern) >= 0) {
				patternWords[index] =word;
				index++;
			}
		}
		return patternWords;
	}
	public static void main(String[] args) {
		String[] words = {"South Africa", "Afghanistan", "Sri Lanka", "New Zealand", "West Indies",
				"England", "India", "Australia", "Pakistan", "Bangladesh"};
		String pattern = "n";
		String[] wordsPattern =getWordsContainsPattern(words, pattern);
		if(wordsPattern.length > 0) {
			for(String word : wordsPattern) {
				System.out.println(word);
			}
		}
		else {
			System.out.println("No string found in array");
		}

	}
}
