package com.java.arrays;

import java.util.Scanner;

public class ZerosOnes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int count0=0;
		for(int num:arr) {
			arr[num]=sc.nextInt();
			if(arr[num]==0)
				count0++;
		}
		for(int i=0;i<count0;i++) {
			arr[i]=0;
		}
		for(int j=count0;j<n;j++) {
			arr[j]=1;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}	
	}
}
