package com.module1.Strings;

import java.util.Scanner;

public class PaprikaPermutations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number t:");
		int t=sc.nextInt();
		
		while(t-- > 0) {
			System.out.println("Enter the length of an array: ");
			int n=sc.nextInt();
			int[] freq =new int[n+1];
			for(int i=0;i<n;i++) {
				System.out.println("Enter the array elements: ");
				int num=sc.nextInt();
				if(num <= n) {
					freq[num]++;
				}
			}
			int missing =0;
			for(int i=1;i<=n;i++) {
				if(freq[i] == 0) {
					missing++;
				}
			}
			if(missing == 0) {
				System.out.println(0);
			}else if (missing == freq[0]) {
				System.out.println(1);
			}else {
				System.out.println(missing);
			}
		}
		sc.close();
	}
}