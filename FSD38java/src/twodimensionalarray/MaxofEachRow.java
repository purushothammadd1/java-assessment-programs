package twodimensionalarray;

import java.util.Scanner;

public class MaxofEachRow {

	public static void main(String[] args) {
			int arr[][]=readMatrix();	
			maxElement( arr.length, arr);
	}
	public static void maxElement(int row,int arr[][]) {

		int max=0;
		int []result =new int[row];
		for(int i=0;i<row;i++) {
			max=0;
			for(int j=0;j<row;j++) {
				System.out.print(arr[i][j]+" ");
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			System.out.print("Maximum number is: "+max);
			System.out.println();
		}
	}
	public static int[][] readMatrix() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows=sc.nextInt();
		
		int arr [][]=new int[rows][rows];
		System.out.println("Enter the elements of an array:");
		
		for(int i=0;i<rows;i++)
			for(int j=0;j<rows;j++)
				arr[i][j]=sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++)
				System.out.print (arr[i][j]+" ");
		System.out.println();
		}
		return arr;
		
	}

}
