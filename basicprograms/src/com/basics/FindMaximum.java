package com.basics;

public class FindMaximum {
	
public static void main(String[] args) {
	int input1 []= {4,3,5};
	String input2="PNP";
	int input3= 3;
	int maximumvalues=findMaximum(input1,input2,input3);
	System.out.println("Maximum values in the given value: "+maximumvalues);
	
}

public static int findMaximum(int[] input1, String input2, int input3) {
	
	int sum=0;
	for(int i=0;i<input1.length;i++) {
		if(input2.charAt(i) == 'P') {
			sum +=input1[i];
		}
		else {
			sum -=input1[i];
		}
	}
	return sum*100;
}
}
