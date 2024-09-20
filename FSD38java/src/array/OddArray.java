package array;

import java.util.Scanner;

public class OddArray {

	public static void main(String[] args) {
		int[] arr=readData();
		System.out.println("Sum of Odd Numbers is: "+printOddArray(arr, 0));
	}

	public static int printOddArray(int[] a,int sum) {
		//int oSum=0;
		//a=readData();
		for(int i=0;i<a.length;i++)
			if(a[i]%2!=0) {
			sum+=a[i];
			}
		return sum;
	}

	public static int[] readData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the Elements of an array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		return arr;
		
		
	}

}
