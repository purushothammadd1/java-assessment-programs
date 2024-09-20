package com.java.arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the given size of an elements: ");
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[n];
		
		reverseArray(n,a);
	}

	public static void reverseArray(int n, int[] a) {
		
		int i=0,j=n-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
