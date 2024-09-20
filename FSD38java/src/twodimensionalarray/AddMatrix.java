package twodimensionalarray;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		int arr[][]=readMatrix();
		System.out.println(additionOfTwoMatrix(arr));

	}

	public static int[][] additionOfTwoMatrix(int arr[][]) {
		Scanner sc=new Scanner(System.in);
		int row=0,col=0;
		int mat1[][]=new int[row][col];
		int mat2[][]=new int[row][col];
		int sum[][]=new int [row][col];
		
		
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++)
						mat1[i][j]=sc.nextInt();
					System.out.println();
				}
				
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++)
						mat2[i][j]=sc.nextInt();
					System.out.println();
				}
				for(int i=0;i<row;i++)
					for(int j=0;j<col;j++)
						sum[i][j]=mat1[i][j]+mat2[i][j];
								System.out.println("Sum of matrix:");
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
						System.out.print(sum[i][j]);
						}
				System.out.println();
				return sum;
	}

	public static int[][] readMatrix() {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the no of rows");
		int row=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int column=sc.nextInt();
		
		int arr[][]=new int [row][column];
		System.out.println("Enter the elements of an array:");
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();	
			}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		return arr;
		
	}

}
