package com.cn.functions;

import java.util.Scanner;

public class NcR {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n=sc.nextInt();
		System.out.print("Enter the value of r:");
		int r=sc.nextInt();
		
		int factN=factorial(n);
		int factR=factorial(r);
		int factNR=factorial(n-r);
//		for(int i=1;i<=n;i++) {
//			factN *=i;
//		}
//		int factR=1;
//		for(int i=1;i<=r;i++) {
//			factR *=i;
//		}
//		int factNR=1;
//		for(int i=1;i<=n-r;i++) {
//			factNR *=i;
//		}
		int result=factN/(factR*factNR);
		System.out.println("The NcR value is "+result);
	}

}
