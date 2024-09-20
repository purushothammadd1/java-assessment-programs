package twodimensionalarray;

import java.util.Scanner;

public class Matrix {

	public static void getDiagonals(int arr[][]) {
		int n=arr.length;
		int sum = 0;
		for(int i=0;i <n;i++) {
			for(int j=0;j <n;j++) {
				if(i == j) {
				
					sum +=arr[i][j];
				}
				
			}
		}
		System.out.println("Forward diagonal sum "+sum);

	}
	public static void getDiagonalReverse(int arr[][]) {
		int n=arr.length;
		int sumA=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i + j == (n-1)) {
					
					
					sumA +=arr[i][j];
				}
				
			}
		}
		System.out.println("Reverse diagonal SUm "+sumA);
	}
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int row=sc.nextInt();
//		System.out.println("Enter the no of columns:");
//		int col=sc.nextInt();
		int arr[][]= new int [row][row];
		System.out.println("Enter elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				arr [i][j] = sc.nextInt();


			}
		}
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(arr.length);
		getDiagonals(arr);
		getDiagonalReverse(arr);
	}

}
