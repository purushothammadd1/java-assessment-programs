package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingMissingElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the given size of an elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		repeatMissingElement1(n,arr);
	}

	public static void repeatMissingElement1(int n, int[] arr) {
		int a = n*(n+1)/2;//15
		int b = n*(n+1)*(2*n+1)/6;//55
		for(int i=0;i<n;i++){
			a = a-arr[i]; 
			b = b-arr[i]*arr[i];
		}
		b = b/a;
		int x = (a+b)/2;
		int y = b-x;

		System.out.println(y);
		System.out.println(x);

	}

	public static void repeatMissingElement(int n, int[] arr) {
		Arrays.sort(arr);
		int mis=-1,rep=-1;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				rep=arr[i];
			}else if (arr[i]+1 != arr[i+1]) {
				mis =arr[i]+1;
			}
			if(arr[0] != 1) {
				mis =1;
			}else if(arr[n-1] != n) {
				mis = n;
			}
			System.out.println(rep);
			System.out.println(mis);
		}
	}

}
