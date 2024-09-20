package array;

import java.util.Scanner;

public class ConsecutiveArray {

	public static void main(String[] args) {
		int [] arr=readData();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the target valule:");
		int target=sc.nextInt();
		consecutiveElement();

	}

	public static void consecutiveElement() {
		// TODO Auto-generated method stub
		
	}

	public static int[] readData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of an array:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		return arr;
		
	}

}
