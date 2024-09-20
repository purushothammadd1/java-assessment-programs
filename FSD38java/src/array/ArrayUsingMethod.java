package array;

import java.util.Scanner;

public class ArrayUsingMethod {

	public static void main(String[] args) {
		
		int[] arr=readData();
		printArray(arr);

	}

	public static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}

	public static int[] readData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements of an array:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		return arr;
		
	}

}
