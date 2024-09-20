package practice;

import java.util.Random;

//suffle the Array

public class Solution {
	int Arr[];
	public  Solution(int[] nums) {
		Arr=nums;
	}
	
	public int[] reset() {
		return Arr;
	}
	public int[] shuffle() {
		int[]Arr2 =Arr.clone();
		for(int i=Arr2.length-1;i>=0;i--) {
			int rand_idx=new Random().nextInt(i+1);
			int temp=Arr2[i];
			Arr2[i]=Arr2[rand_idx];
			Arr2[rand_idx]=temp;
		}
		return Arr2;
	}

}
