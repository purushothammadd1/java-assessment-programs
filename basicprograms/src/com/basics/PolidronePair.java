package com.basics;

public class PolidronePair {
	public static void main(String[] args) {
		String [] input1= {"ac","bb","dd"};
		int input2=3;
		int palindromepairs=polindromPair(input1,input2);
		System.out.println("No of Pairs: "+palindromepairs);
	}

	public static int polindromPair(String[] input1, int input2) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<input2;i++) {
			String s1=input1[i];
			for(int j=i+1;j<input2;j++) {
				String s2=input1[j];
				String concatenated=s1+s2;
				if(isPalidrome(concatenated)) {
					count++;
				}
			}
		}
		return count;
	}

	public static boolean isPalidrome(String s) {
		// TODO Auto-generated method stub
		int[] charCounts=new int[26];
		for(char c:s.toCharArray()) {
			charCounts[c - 'a']++;
		}
		int oddCount =0;
		for(int count: charCounts) {
			if(count % 2 == 1) {
				oddCount++;
			}
			if(oddCount >1) {
				return false;
			}
		}
		return true;
	}

}
