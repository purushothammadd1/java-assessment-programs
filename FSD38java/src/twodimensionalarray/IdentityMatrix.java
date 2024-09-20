package twodimensionalarray;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=readMatrix();
		identityMatrix(arr);

	}

	private static void identityMatrix(int arr[][]) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					if(arr[i][j]!=1) {
						System.out.println("Not identical matrix");
						flag=true;
						break;
					}
				}
				else {
					if(arr[i][j]!=0) {
						System.out.println("Not identical matrix");
						flag=true;
						break;
					}
				}
			}	
		}
		if(!flag) {
			System.out.println("Identical Matrix");
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
