package array;

import java.util.Scanner;

public class ElementsArray {

	public static void main(String[] args) {
		int [] arr=readData();	
		repeatedElement(arr, arr);
}
	

	public static void repeatedElement(int []size,int arr[]) {
		for(int i=0;i<size.length;i++) 
		for(int j=i+1;j<size.length;j++){
			//if(arr[i]==arr[j])
		}
		
	}


	public static int[] readData() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of an array:");
		int arr[]=new int[size];
		return arr;
		
	}
}