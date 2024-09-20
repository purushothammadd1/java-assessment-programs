package com.java.arrays;

import java.util.Scanner;

public class StoreMaximum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the given size of an elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		storeMax(n,arr);

	}

	public static void storeMax(int n, int[] arr) {
		int water=0;
		for(int i=0;i<n;i++) {
			int max1=arr[i];
			int max2=arr[i];
			for(int j=i+1;j<n;j++) {
				if(arr[j]> max2) {
					max2=arr[j];
				}
				
			}
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>max1) {
					max1=arr[j];
				}
			}
			water +=Math.min(max1, max2)-arr[i];
		}
		System.out.print(water);
	}

}
