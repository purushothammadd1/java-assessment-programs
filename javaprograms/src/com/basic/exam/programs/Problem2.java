package com.basic.exam.programs;
/*Joseph is learning digital logic subject which will be for his next semester.He usually tries to solve unit assignment problems before the lecture.
 * Today he got one tricky question.The problem statement is "A positive Integer has been given as a input.convert decimal value to binary representation.Toggle all bits of it after the most siginificant 
 * bit including the most significant bit including the most significantbit.Print the positive integer value after toogle all bits."
 * 
 * constraints-
 * 1<=N<=100
 * Example:1 Input: 10 (1010)->Integer
 * output: 5(0101) */

public class Problem2 {
	public static void main(String[] args) {
		int n=10; //example input: you can replace it with any positive integer
		int result=toogleBits(n);
		System.out.println("Result: "+result);
	}

	public static int toogleBits(int n) {
		//step 1:Convert decimal to binary
		String binary=Integer.toBinaryString(n);
		
		//step 2: Toogle all bits after the most significant bit
		StringBuilder toogleBinary = new StringBuilder();
		boolean leadingOne = false; //flag to indicate if the most significant bit has been encountered
		for(int i=0;i<binary.length();i++) {
			if(!leadingOne && binary.charAt(i) == '1') {
				leadingOne = true;
			}
			if(leadingOne) {
				toogleBinary.append(binary.charAt(i) == '0' ? '1' : '0');
			}
		}
		//step3: convert toggled binary back to decimal
		int result=Integer.parseInt(toogleBinary.toString(),2);
		return result;
	}

}
