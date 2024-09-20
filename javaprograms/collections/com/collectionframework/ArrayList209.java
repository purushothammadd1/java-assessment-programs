package com.collectionframework;

import java.util.ArrayList;

public class ArrayList209 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println(nums);
		
		for(int val=10;val <= 50;val += 10) {
			nums.add(val);
			System.out.println(nums);
		}
		
		for(int idx=0;idx<nums.size();idx++) {
			System.out.print(nums.get(idx)+ " ");
		}
		System.out.println();
		//updation: O(N)
		for(int idx=0;idx<nums.size();idx++) {
			nums.set(idx,nums.get(idx)+5);
			System.out.print(nums.get(idx)+" ");
		}
		System.out.println();
		
		System.out.println(nums.remove(0));
		
		System.out.println(nums.size() - 1);
		
		nums.add(0,100);
		System.out.println(nums);
		
		nums.add(2, 200);
		System.out.println(nums);
		System.out.println(nums.size());
		
		
		
	}
}
