package com.java.arrays;

import java.util.Scanner;

public class FindDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the given size of an elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(findDuplicate(arr));
	}

	public static boolean findDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		for(int l=0;l<arr.length;l++) {
			for(int r=l+1;r<arr.length;r++) {
				if(arr[l] == arr[r])
					return true;
			}
		}
		return false;
	}

}
