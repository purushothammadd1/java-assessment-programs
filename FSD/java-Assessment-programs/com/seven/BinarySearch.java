package com.seven;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {2,5,8,12,16,23,38,56,72,91};
		
		System.out.println("Enter the target value to search for: ");
		int target=sc.nextInt();
		
		int result=binarySearch(arr,target);
		
		if(result != -1) {
			System.out.println("Target found at index: "+result);
		}else {
			System.out.println("Target value not found in the array.");
		}
		sc.close();
	}

	public static int binarySearch(int[] arr, int target) {
		int left=0;
		int right=arr.length-1;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[mid] < target) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
	}
}
