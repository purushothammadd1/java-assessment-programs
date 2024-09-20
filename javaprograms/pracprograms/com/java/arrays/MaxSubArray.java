package com.java.arrays;

import java.util.Scanner;

public class MaxSubArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the given size of an elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		maxSubarray(n,arr);//add the sub array
//		maxMulArray(n,arr);//multiply the sub array
//		printAllSubArray(n,arr);
		sumEqualsZero(n,arr);
	}

	public static void sumEqualsZero(int n, int[] arr) {
		boolean ans=false;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(sum==0) {
					ans = true;
					break;
				}
			}
		}
		System.out.print(ans);
	}

	public static void printAllSubArray(int n, int[] arr) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
		
	}

	public static void maxMulArray(int n, int[] arr) {
		boolean ans=false;
		int maxSum=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=1;
				for(int k=i;k<=j;k++) {
					sum *= arr[k];
				}
				if(sum>maxSum) {
					maxSum=sum;
				}
			}
		}
		System.out.print(maxSum);
	}

	public static void maxSubarray(int n, int[] arr) {
		boolean ans=false;
		int maxSum=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum +=arr[k];
				}
				if(sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		System.out.print(maxSum);//add the sub array elements
	}

}
