package com.leetcode.interviewprograms;

import java.util.Arrays;

/*
 * Find the minimum number of groups who's sum of each group is at max 3, and every element must be in a group.
Given an Array like: [1.01, 1.01, 3.0, 2.7, 1.99, 2.3, 1.7]
return the minimum number of groups, in this case it would be 5 groups: (1.01 , 1.99), (1.01, 1.7), (3.0), (2.7), (2.3)
Constraint: all elements are between 1.01-3 inclucsive, and each groups sum is at max 3
*/
public class MorganStanley {
	private static int minDayRequiredToComplete(float[] movieDuration) {
		int dayRequired =0;
		Arrays.sort(movieDuration);
		int startIndex =0;
		
		for(int endIndex=movieDuration.length-1; endIndex >= startIndex; endIndex--) {
			if(movieDuration[endIndex] > 1.99f) {
				dayRequired++;
			}else if (movieDuration[endIndex] <= 1.99f) {
				if(startIndex != endIndex && movieDuration[startIndex] + movieDuration[endIndex] <= 3f) {
					startIndex++;
				}
				dayRequired++;
			}
		}
		return dayRequired;
	}
	public static void main(String[] args) {
		float[] movieDuration1 = {2.1f,2.1f,2.1f,2.1f,2.1f,2.1f,2.1f,2.1f,2.1f,2.1f};
		float[] movieDuration2 = {1.01f, 1.01f, 3.0f, 2.7f, 1.99f, 2.3f, 1.7f};
		System.out.println(minDayRequiredToComplete(movieDuration2));
	}
}
