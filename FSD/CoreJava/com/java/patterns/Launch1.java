package com.java.patterns;

public class Launch1 {
	public static void main(String[] args) {

		//		launch1();
		//		launch2();
		//		launch3();
		//		launch4();

		//		launch5();
		launch6();
	}

	public static void launch6() {
		int n=10;

		for(int i=0;i<n; i++)
		{
			for(int j=0 ; j<n; j++)
			{
				if((j==0 && i>0) ||
						(i==(n-1)/2 && j<=(3*n)/4) ||
						(i==0 && j<(3*n)/4) && j>0||
						(j==(3*n)/4 && i>0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}

			}
			for(int j=0 ; j<n; j++)
			{
				if((i==0 && j<(n-1)/2)|| (i==(n-1)/2)&& j>0 && j<(n-1)/2 
						||(i==n-1 && j<(n-1)/2) ||
						(j==(n-1)/2 && i>0 && i!=(n-1)/2 && i<n-1) || j==0
						)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}

			}
			for(int j=0 ; j<n; j++)
			{
				if(i==0 && j>0 && j<(3*n)/4  || j==0 && i>0 && i<n-1 
						|| i==n-1 && j>0 && j<(3*n)/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}

			}
			System.out.println();
		}

	}

	public static void launch5() {
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 ||
						j==(n-1)/2 && i<(n-1)/2 && i>0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void launch4() {
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i == 0 && j < n-1 || j==0 || (i == n-1 && j<n-1) || (j==n-1 && i>0 && i<n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void launch1() {
		int n=10;
		for(int i=0;i<n;++i) {
			System.out.println("*");
		}

	}

	public static void launch3() {
		int n=15;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void launch2() {
		int n=5;
		int i=0;
		while(i<n) {
			System.out.print("*");
			i++;
		}

	}

}
