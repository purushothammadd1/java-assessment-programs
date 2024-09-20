package com.modulets.interviewprac;

public class SpinningArray {
	
	public static int[] rotate(int[] arr, int nop) {
		if(arr == null)
			return null;
		if(arr.length == 1)
			return arr;
		if(nop == 0)
			return arr;
		
		for(int i=1;i<=nop;i++) {
			int last =arr[arr.length - 1];
			for(int j =arr.length -2;j >=0;j--) {
				arr[j + 1] =arr[j];
			}
			arr[0] = last;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= new int[] { 1, 2, 3, 4};
		arr = SpinningArray.rotate(arr, 2);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
