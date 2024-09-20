package com.java.patterns;

public class Launch2 {
	public static void main(String[] args) {
		int n=11;
//		launch7();
		launch8(n);
	}
	

	public static void launch8(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==n/4 && j>n/4 && j<(3*n)/4) ||
						(i==(3*n)/4 && j>n/4 && j<(3*n)/4 ||
						(j==n/4 && i>n/4 && i<(3*n)/4) || 
						(j ==(3*n)/4 && i>n/4 && i<(3*n)/4 || 
						(i==j) && i>n/2 && j>n/2))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static void launch7() {
		int n=30;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j ==(n-1)/2 || i-j == (n-1)/2 || j-i==(n-1)/2 || i+j == n-1 + (n-1)/2 || i==j || i+j == n-1 || i==0 ||j==0 ||i==n-1 || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
