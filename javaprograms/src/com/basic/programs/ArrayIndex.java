package com.basic.programs;

import java.util.Scanner;

public class ArrayIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[] =linearData();
		System.out.println("Enter the key value: ");
		int key=sc.nextInt();
		printSearch(arr,key);
		
	}

	public static void printSearch(int[] arr, int key) {
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
			if(arr[i] == key) {
				System.out.println("Element Found at Index: "+i);
				flag = true;
				break;
			}
		if(!flag)
			System.out.println("Element Not found");
		
	}

	public static int[] linearData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size =sc.nextInt();
		System.out.println("Enter the elements of an array: ");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
			arr[i] =sc.nextInt();
		return arr;
	}

}
