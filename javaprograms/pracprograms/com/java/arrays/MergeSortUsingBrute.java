package com.java.arrays;

import java.util.Scanner;

public class MergeSortUsingBrute {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the first elements of an given size: ");
		int[] arr1=new int[n];
		for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
		System.out.println("Enter the second array size of an array: ");
		int m=sc.nextInt();
		System.out.println("Enter the second elements of an given size: ");
		int[] arr2=new int[m];
		for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
		int[] arr3=new int[n+m];
		
		int i=0;
        for(i=0;i<n;i++){
            arr3[i] = arr1[i];
        }
        for(int j=i;j<n+m;j++) {
        	arr3[j] =arr2[j-n];
        }
        //bubble sort technique
        for(i=0;i<n+m;i++) {
        	for(int j=0;j<n+m-1;j++) {
        		if(arr3[j]>arr3[j+1]) {
        			int temp=arr3[j+1];
        			arr3[j+1]=arr3[j];
        			arr3[j]=temp;
        		}
        	}
        }
        for(int i1=0;i1<n+m;i1++) {
        	System.out.print(arr3[i1]+" ");
        }
		
	}

}
