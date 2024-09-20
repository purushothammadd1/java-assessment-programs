package com.cn.basics;

import java.util.Scanner;

public class SumOfArrayIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		System.out.println("Enter the list of elements:");
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println("The sum of n elements "+sum);
		
		
	}

}
