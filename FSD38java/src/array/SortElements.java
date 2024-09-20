package array;

import java.util.Scanner;

public class SortElements {

	public static void main(String[] args) {
		int []arr=readData();
		sortArray(arr, arr);

	}

	public static void sortArray(int[] a,int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				System.out.print("Elements of array after sorted in ascending order:"+arr[i]);
				System.out.println();
				}
			}
		}
		
	}

	public static int[] readData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		System.out.print("Enter the elements of an array:");
		System.out.println();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
			
			arr[i]=sc.nextInt();
		System.out.print("Elements of Original Array:");
		System.out.println();
		return arr;
		
	}

}
