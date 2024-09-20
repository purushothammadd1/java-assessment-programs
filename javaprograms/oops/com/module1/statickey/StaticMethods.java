package com.module1.statickey;

public class StaticMethods {
	public static void main(String[] args) {
//		Launch1();
		Launch2();
	}

	public static void Launch2() {
		boolean flag= false;
		System.out.println((flag = true) | (flag = false) || (flag = true));
		
	}

	public static void Launch1() {
		int a=3;
		m(++a, a++);
		System.out.println(a);
		
	}
	public static void m(int i,int j) {
		i++;
		j--;
	}

}
