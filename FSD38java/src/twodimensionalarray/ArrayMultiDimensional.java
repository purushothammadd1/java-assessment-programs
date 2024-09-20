package twodimensionalarray;

import java.util.Scanner;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
	}

}
