package com.interview.pract;

import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements given size of an array: ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("Count of natural numbers in the array is: "+naturalNumbers(arr));
		System.out.print(naturalNumber(arr));
	}

	public static int naturalNumber(int[] arr) {
		for(int i=1;i<=arr.length;i++) {
			
		}
		return 0;
		
	}

	public static int naturalNumbers(int[] arr) {
		int count=0;
		for(int num: arr) {
			if(num > 0) {
				count++;
			}
		}
		return count;
	}

}
/*
 * input:A[6]= {1,0,-5,-6,4,2}
 * output:3
 * 4,2,1,3*/
