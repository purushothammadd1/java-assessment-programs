package com.module1;

public class Assessment {
	public static void main(String[] args) {
		int[] arr= {1,1,1,1,3,3,6,7,3,9,2,5,2};
		System.out.println(lastOccurence(arr,3));
	}

	public static int lastOccurence(int[] arr, int value) {
		int n=arr.length;
		int first= -1;
		int last = -1;
		for(int i=0;i<n;i++)
		{
			if(value != arr[i])
				continue;
			if(first ==1)
				first =i;
		}
		return last;
	}
	public static boolean areAllUpperCase(String sentence) {
		for(int i=0;i<sentence.length(); i++)
			if(Character.isLetter(sentence.charAt(i)) && Character.isLowerCase(sentence.charAt(i)))
				return false;
		return true;
	}
	public static boolean areAllLowerCase(String word) {
		for(int i=0;i<word.length();i++) {
			if(Character.isUpperCase(word.charAt(i)))
				return false;
		}
		return true;
	}
	public static boolean isTitleCaseWord(String word) {
		return Character.isUpperCase(word.charAt(0)) && areAllLowerCase(word.substring(1));
	}
	public static boolean isTitleCase(String sentence) {
		String[] words = sentence.split(" ");
		for(String word : words){
			if(!isTitleCase(word))
				return false;
		}
		return true;
	}
	
}
