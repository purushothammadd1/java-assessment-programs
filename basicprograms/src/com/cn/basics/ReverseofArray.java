package com.cn.basics;

import java.util.Scanner;

public class ReverseofArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of an array:");
		int [] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//main logic
		int i=0;
		int j=size-1;
		while ( i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;j--;
		}
		for(int k=0;k<size;k++) {
			System.out.println(arr[k]+" ");
		}
	}

}
