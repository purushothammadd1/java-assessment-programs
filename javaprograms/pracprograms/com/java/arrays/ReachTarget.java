package com.java.arrays;

import java.util.Scanner;

public class ReachTarget {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the given size of an elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Target value :");
		int k=sc.nextInt();
		System.out.print(targetValue(n,arr,k));
	}

	public static int targetValue(int n, int[] arr, int k) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int sum=arr[i]+arr[j];
				if(sum==k) {
					System.out.println(i+" "+j);
				}
			}
		}
		return k;
		
	}

}
