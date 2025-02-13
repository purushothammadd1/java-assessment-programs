package com.java.arrays;

public class PowerSorted {
	 static int pow(int n) {
			if(n==0)
				return 1;
			return 2*pow(n-1);
		}
	 static int power(int n) {
			if(n==0)
				return 1;
			if(n%2==0)
				return power(n/2)*power(n/2);
			else
				return 2*power(n-1);
		}
	 static boolean isSorted(int[] arr, int n) {
		 if(n==0||n==1)
			 return true;
		 return arr[n-1]>=arr[n-2] && isSorted(arr, n-1);
	 }

	public static void main(String[] args) {
		int n=9;
		System.out.println(pow(n));
		System.out.println(power(n));
		int[] arr1= {1,2,2,3,4};
		int[] arr2= {6,1,2};
		System.out.println(isSorted(arr1, arr1.length));
		System.out.println(isSorted(arr2, arr2.length));
		
	}

	 
	

}
