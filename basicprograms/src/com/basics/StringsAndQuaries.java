package com.basics;

public class StringsAndQuaries {
	public static void main(String[] args) {
		String input1="abadabcd";
		int input2=8;
		int [][] input3= {{1,3},{2,5}};
		int input4=2;
		System.out.println(quaries(input1,input2,input3,input4));
	}

	public static int[] quaries(String input1, int input2, int[][] input3, int input4) {
		// TODO Auto-generated method stub
		int res[] =new int[input4];
		for(int i=0;i<input4;i++) {
			int l =input3[i][0];
			int r=input3[i][0];
			String sub=input1.substring(l-1,r);
			int [] freq =new int[26];
			for(char c:sub.toCharArray()) {
				freq[c- 'a']++;
			}
			int oddFreqCount=0;
			for(int j=0;j<26;j++) {
				if(freq[j] % 2 != 0) {
					oddFreqCount++;
				}
			}
			res[i]=Math.max(0, oddFreqCount-1);
		}
		return res;
	}

}
