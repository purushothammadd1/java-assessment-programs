package com.module1.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {

	public void sumOfOddNumbers_Usual() {
		List<Integer> numbers =Arrays.asList(1,3,4,6,2,7);
		int sum=0;
		for(int number: numbers)
			if(number%2 != 0)
				sum += number;
		assertEquals(11,sum);
	}

	@Deprecated
	public void assertEquals(int expected, int actual) {
		if (expected != actual) {
			throw new AssertionError("Expected " + expected + " but found " + actual);
		} else {
			System.out.println("Test passed!");
		}
	}

	public static void main(String[] args) {
		SumOfOddNumbers obj = new SumOfOddNumbers();
		obj.sumOfOddNumbers_Usual();
	}
}
