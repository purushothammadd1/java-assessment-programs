package twodimensionalarray;

import java.util.Scanner;

public class SumofTwoMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int columns=sc.nextInt();
			int mat1[][]=new int[rows][columns];
			int mat2[][]=new int[rows][columns];
			int sum[][]=new int [rows][columns];
			System.out.println("Enter the elements of an array:");
					for(int i=0;i<rows;i++) {
						for(int j=0;j<columns;j++)
							mat1[i][j]=sc.nextInt();
						System.out.println();
					}
					System.out.println("Enter the elements of matrix2:");
					for(int i=0;i<rows;i++) {
						for(int j=0;j<columns;j++)
							mat2[i][j]=sc.nextInt();
						System.out.println();
					}
					for(int i=0;i<rows;i++)
						for(int j=0;j<columns;j++)
							sum[i][j]=mat1[i][j]+mat2[i][j];
									System.out.println("Sum of matrix:");
					for(int i=0;i<rows;i++)
					{
						for(int j=0;j<columns;j++)
							System.out.print(sum[i][j]);
					}
					System.out.println();
			
		
	}

}
