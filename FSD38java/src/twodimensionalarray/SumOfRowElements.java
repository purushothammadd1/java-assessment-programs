package twodimensionalarray;

import java.util.Scanner;

public class SumOfRowElements {

	public static void main(String[] args) {
		int arr[][]=readMatrix();
		sumOfRowElements(arr);

	}

	public static void sumOfRowElements( int arr[][]) {
		int n=arr.length;
		int sum;
		for(int i=0;i<n;i++) {
			sum=0;
			for(int j=0;j<n;j++) {
				sum+=arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.print(" sum is: "+sum);
			System.out.println();
		}
		
	}
	public static int[][] readMatrix() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int columns=sc.nextInt();
		
		int arr [][]=new int[rows][columns];
		System.out.println("Enter the elements of an array:");
		
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				arr[i][j]=sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++)
				System.out.print (arr[i][j]+" ");
		System.out.println();
		}
		return arr;
	}
		
	}


