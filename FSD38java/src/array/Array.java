package array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		float arr[]=new float[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in array:");
		for (int i=0;i<arr.length;i++)
		arr[i]=sc.nextFloat();
		for(int i=0;i<arr.length;i++)
		
		{
			System.out.println("Enter the list of array elements:"+arr[i]);
		}
	}
}
