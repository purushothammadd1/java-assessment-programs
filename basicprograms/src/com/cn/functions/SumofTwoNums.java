package com.cn.functions;

public class SumofTwoNums {
//	static double sum(int a,int b, double c) {
//		double ans=a+b+c;
//		return ans;
//	}
	static void printEven(int start, int end) {
		if(start % 2!=0) {
			start++;
		}
		for(int i=start;i<=end;i +=2) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		printEven(3,17);
//		int num1=10;
//		int num2=16;
////		sum(num1,num2, 10.5);
//		double ans=sum(num1,num2,10.5);//26+10.5=36.5
//		System.out.println(ans);
	}

}
