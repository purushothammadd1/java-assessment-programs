package com.java.arrays;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array 1:");
		int size1=sc.nextInt();
		System.out.println("Enter the elements of an given size1: ");
		int[] arr1=new int[size1];
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of an array 2:");
		int size2=sc.nextInt();
		System.out.println("Enter the elements of an given size2: ");
		int[] arr2=new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		if(size1 == 0 && size2 == 0) {
			System.out.println(-1);
		}
		int[] marr=new int[size1+size2];
		int p1=0,p2=0,k =0;
		while(p1 < size1 && p2 < size2) {
			if(arr1[p1] <= arr2[p2]) {
				marr[k] = arr1[p1];
				p1++;
				k++;
			}else {
				marr[k]=arr2[p2];
				p2++;
				k++;
			}
		}
		while(p1 < size1) {
			marr[k] = arr1[p1];
			k++;
			p1++;
		}
		while(p2 < size2) {
			marr[k]= arr2[p2];
			k++;
			p2++;
		}
		for(int ele:marr) {
			System.out.print(ele+" ");
		}
		
	}

}
