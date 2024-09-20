package com.basics.Numbers;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int []nums=new int[k];
		findKthLargest(nums, k);

	}
	static int findKthLargest(int [] nums,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(k+1);

		for(int i:nums) {
			pq.add(i);
			if(pq.size()>k) {
				pq.poll();
			}
		}

		return pq.poll();

	}

}
