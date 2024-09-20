package com.basic.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		System.out.println("Enter the elements of an array: ");
		int[] nums =new int[size];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		int target = 0;
		List<List<Integer>> quadruplets = fourSum(nums, target);
		System.out.println(quadruplets);
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> quadruplets = new ArrayList<>();
		
		if(nums == null || nums.length < 4) {
			return quadruplets;
		}
		Arrays.sort(nums);
		
		int n=nums.length;
		for(int i=0;i<n -3; i++) {
			//skip duplicates for the first element
			if(i>0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for(int j=i+1;j<n - 2;j++) {
				//skip duplicates for the second element
				if(j > i+1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int left =j+1; //pointer for the third element
				int right=n-1; //pointer for the fourth element
				
				while(left < right) {
					int sum = nums[i] + nums[j] + nums[left]+ nums[right];
					
					if(sum == target) {
						//Found a quadruplet with the target sum, add it to the result
						quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						
						while(left < right && nums[left] == nums[left + 1]) {
							left++;
						}
						
						while(left < right && nums[right] == nums[right - 1]) {
							right--;
						}
						left++;
						right--;
					}else if(sum < target) {
						left++;
					}else {
						right--;
					}
				}
			}
		}
		return quadruplets;
	}
}
