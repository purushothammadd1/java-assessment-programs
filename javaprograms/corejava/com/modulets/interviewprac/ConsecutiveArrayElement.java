package com.modulets.interviewprac;

public class ConsecutiveArrayElement {
	public static int validateInputs(int[] arr, int target) {
		if(arr.length == 0)
			return -1;
		for(int n: arr) {
			if(n <= 0) {
				return -2;
			}
		}
		if(target <= 0)
			return -3;
		
		return 1;
	}
	public static boolean containsConsecutiveElement(int[] arr, int target) {
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			sum = 0;
			
			for(int j =i; j< arr.length;j++) {
				sum += arr[j];
				
				if(sum > target)
					break;
				if(sum == target)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= new int[] {1,3,5,7,9};
		int target=-15;
		if(validateInputs(arr, target) == 1) {
			System.out.println(containsConsecutiveElement(arr, target));
		}else {
			System.out.println("Invalid Inputs");
		}
	}

}
