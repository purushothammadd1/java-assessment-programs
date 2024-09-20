package array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		 int arr[]=readData();
		 
	}
	public static int validateInputs(int sum, int[] arr) {
		if(arr.length<=0) {
			return -1;
		}	
	
	if(sum<=0) {
		return -3;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<=0) {
			return -2;
		}
	}
	return 1;
}
   	public static boolean sumArray(int sum, int[] arr) {
	// TODO Auto-generated method stub
   		boolean res=false;
   		for(int i=0;i<arr.length;i++) {
   			int sum1=arr[i];
   			for(int j=0;j<arr.length;j++) {
   				if((sum1+ arr[j])<= sum) {
   					sum1 += arr[j];
   				}
   				if(sum1>sum) {
   				break;
   				}
   				if(sum1==sum) {
   					res=true;
   				}
   			}		
   		}
   		return res;
   		}
	public static int[] readData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("How much size is required?");
		int size=sc.nextInt();
		System.out.println("Enter the elements of an array");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter sum:");
		int sum=sc.nextInt();
		System.out.println(validateInputs(sum,arr));
		System.out.println(sumArray(sum,arr));
		return arr;
	}
	

	
}
