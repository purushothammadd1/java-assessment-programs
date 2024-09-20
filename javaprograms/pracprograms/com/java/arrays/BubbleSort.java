package com.java.arrays;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of an given size: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		bubbleSort(n,arr);
		maximumProduct(n,arr);
	}

	public static void maximumProduct(int n, int[] arr) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int ans=Math.max(arr[0]*arr[1]*arr[n-1],arr[n-1]*arr[n-2]*arr[n-3]);
		System.out.print(ans);
		
	}

	public static void bubbleSort(int n, int[] arr) {
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1;j++)
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
