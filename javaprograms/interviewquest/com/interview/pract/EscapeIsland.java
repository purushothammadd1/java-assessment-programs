package com.interview.pract;

import java.util.Arrays;
import java.util.Scanner;

public class EscapeIsland {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n == 0) {
			System.out.println(0);
			return;
		}
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int midIndex = n/2;
		if(n % 2 == 0) {
			System.out.println(arr[midIndex - 1]);
			System.out.println(arr[midIndex]);
		}else {
			System.out.println(arr[midIndex]);
		}
		/*
		 int[] arr=new int[n]; 
	     for(int i=0 ; i<n; i++) { 
		 arr[i]=sc.nextInt(); }
		 Arrays.sort(arr);
		 int mid1=arr[n / 2];
		 int mid2 = arr[n / 2 - 1];
		 System.out.println(mid1);
		 if(n % 2 == 0) {
			System.out.println(mid2);
		 }
		 */
		
	}

}
