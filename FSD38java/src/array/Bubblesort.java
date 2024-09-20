package array;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sortingArray(n,arr);
	}

	public static void sortingArray(int n,int []arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j);
				}
			}
		}
		print(arr);
	}
	public static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void swap(int[] arr, int j) {
		// TODO Auto-generated method stub
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;	
	}
}
