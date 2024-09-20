package array;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		int[] arr=readAdd();
		printAdd(arr, 0);
	}

	public static void printAdd(int[] a, int sum) {
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
			System.out.println(sum);
	}
	public static int[] readAdd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println();
		return arr;
		
	}

}
//sum of odd elements of array
//find max elements