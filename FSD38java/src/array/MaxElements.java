package array;

import java.util.Scanner;

public class MaxElements {

	public static void main(String[] args) {
		int arr[]=readData();
		maxElement(arr);

	}

	public static void maxElement(int a []) {
		int max=a[0];
		for(int i=0;i<a.length;i++)
		if(a[i]>max) {
			max=a[i];
		}
			System.out.print("The Maximum of an given array element:"+max);
		
	}

	public static int[] readData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		System.out.print("Enter the elements of an array:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		return arr;
		
		
	}

}
