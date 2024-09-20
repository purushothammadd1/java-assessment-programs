package twodimensionalarray;

import java.util.Scanner;

public class DiagaonalMatrixInMultiDImensional {
	
	

	public static void main(String[] args) {
	 int arr[][]=readMatrix();
	 printDiagonalMatrix();

	}

	public static int printDiagonalMatrix() {
		Scanner pm=new Scanner(System.in); 
		int sum = 0;
		int row =0;
		for(int i=0;i < row;i++) {
			int col =0;
			for(int j=0;j < col;j++) {
	        if(i == j) {
	        	sum += (i+j);
	        }
			}
			}
		return sum;
		
	}
	public static int[][] readMatrix() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int row=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int col=sc.nextInt();
		
		int  arr[][]=new int [row][col];
			for(int i=0;i<row;i++)
				for(int j=0;j<col;j++) {
					System.out.print(arr[i][j]+" ");
				System.out.println();
				}
		
		//return null;
			return arr;
		
	}

}
