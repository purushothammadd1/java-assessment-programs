package array;

import java.util.Scanner;

public class LinearArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=linearData();
		System.out.println("Enter the key value:");
		int key=sc.nextInt();
		printSearch(arr,key);
		//System.out.println(	printSearch(arr,key));

	}

	public static void printSearch(int arr[],int key) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
			System.out.println("Element found at index:"+i);
		flag=true;
		break;
			}
		}
		if(!flag)//!false true
			System.out.println("Element not found");
//		for(int i=0;i<arr.length;i++) {
//				if(arr[i]==key) {
//					return "Element Found";
//				}
//		}
//		return "Element not Fund";
	}

	public static int[] linearData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of an Array:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		 arr[i]=sc.nextInt();
		return arr;
		
		
	}

}
